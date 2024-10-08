package io.github.cyal1.pyburp;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ComboBoxRenderer extends JLabel implements ListCellRenderer<Object> {

    private final Border insetBorder;

    private final DefaultListCellRenderer defaultRenderer;

    public ComboBoxRenderer(int padding) {
        this.insetBorder = new EmptyBorder(padding, padding, padding, padding);
        this.defaultRenderer = new DefaultListCellRenderer();
    }

    public Component getListCellRendererComponent(JList<? extends Object> list,
                                                  Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if(value instanceof JSeparator){
            return (Component)value;
        }else{
            setText(value.toString());
        }
        JLabel renderer = (JLabel) defaultRenderer
                .getListCellRendererComponent(list, value, index, isSelected,
                        cellHasFocus);
        renderer.setBorder(insetBorder);
        return renderer;
    }
}
