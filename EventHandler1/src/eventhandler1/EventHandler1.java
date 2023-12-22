/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventhandler1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Advie Rifaldy
 */
public class EventHandler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel lb = new JLabel("");
        String[] items = {"roti", "madu"};

        JComboBox comboBox = new JComboBox(items);

        JPanel panel = new JPanel();
        panel.add(comboBox, BorderLayout.WEST);
        panel.add(lb, BorderLayout.NORTH);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mn = (String) comboBox.getSelectedItem();
                lb.setText(mn);
            }
        });
        
        frame.add(panel);
        frame.setSize(200,200);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
