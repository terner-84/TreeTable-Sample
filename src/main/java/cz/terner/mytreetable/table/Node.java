/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.mytreetable.table;

import org.jdesktop.swingx.treetable.AbstractMutableTreeTableNode;

/**
 *
 * @author terner
 */
public class Node extends AbstractMutableTreeTableNode {

    public Node(Object[] data) {
        super(data);
    }
    
    @Override
    public Object getValueAt(int columnIndex) {
        return getData()[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return getData().length;
    }
    
    public Object[] getData() {
        return (Object[]) getUserObject();
    }
}
