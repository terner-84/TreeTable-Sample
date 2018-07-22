/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.mytreetable.gui;

import cz.terner.mytreetable.table.TreeTable;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author terner
 */
public class ShowJXTreeTable {
    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        
        List<String[]> content = new ArrayList<>();
        
        content.add(new String[] { "Heading 1" });
        content.add(new String[] { "Sub 1", "Sub 2", "Sub 3" });
        content.add(new String[] { "Heading 2" });
        content.add(new String[] { "Sub 1", "Sub 2", "Sub 3" });
        content.add(new String[] { "Heading 3" });
        content.add(new String[] { "Sub 1", "Sub 2", "Sub 3" });
        content.add(new String[] { "Heading 4" });
        content.add(new String[] { "Sub 1", "Sub 2", "Sub 3" });
        
        TreeTable treeTable = new TreeTable(content);
                
        testFrame.setSize(500, 500);
        
        testFrame.setLayout(new BorderLayout());
        
        testFrame.add(new JScrollPane(treeTable.getTreeTable()), BorderLayout.CENTER);
        
        testFrame.setVisible(true);
        
    }
}
