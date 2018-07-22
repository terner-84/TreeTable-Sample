/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.mytreetable.table;

import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.plaf.IconUIResource;
import org.jdesktop.swingx.JXTreeTable;
import org.jdesktop.swingx.treetable.DefaultTreeTableModel;

/**
 *
 * @author terner
 */
public class TreeTable {
    private String[] headings = {"Col 1", "Col 2", "Col 3"};
    private Node root;
    private ImageIcon icon;
    private DefaultTreeTableModel model;
    private JXTreeTable table;
    private List<String[]> content;
    
    public TreeTable(List<String[]> content) {
        this.content = content;
        icon = createImageIcon("/images/shield.png", "");
    }
    
    
    
    public JXTreeTable getTreeTable() {
        root = new RootNode("Root");
        ChildNode myChild = null;
        for (String[] data : this.content) {
            ChildNode child = new ChildNode(data);
            if (data.length <= 1) {
                root.add(child);
                myChild = child;
            } else {
                myChild.add(child);
            }
        }
        model = new DefaultTreeTableModel(root, Arrays.asList(headings));
        table = new JXTreeTable(model);
        table.setShowGrid(true, true);
        table.setColumnControlVisible(true);
        //table.setCollapsedIcon(icon);
        table.packAll();
        return table;
    }
    
    protected ImageIcon createImageIcon(String path,
                                           String description) {
    java.net.URL imgURL = this.getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        System.err.println(this.getClass().toString());
        return null;
    }
}
}
