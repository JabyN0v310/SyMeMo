package Controller;

import java.awt.Component;

import javax.swing.JPanel;

public class LimpiarComponentes {
    
    public static void JTextField(JPanel panel)
    {
        Component[] componentes=panel.getComponents();
        
        for(Component item:componentes)
        {
            if(item.getClass().getName().equals("javax.swing.JTextField"))
            {
                ((javax.swing.JTextField)item).setText("");
            }
        }
    }
}