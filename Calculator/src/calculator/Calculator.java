/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Advie Rifaldy
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void Form() {
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setSize(500, 500);

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(4, 1, 10, 10));
        grid.setSize(500, 500);

//        Component[] cc = (Component[]) c.toArray();
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn0);

        JTextField input = new JTextField();
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = input.getText();
                input.setText(text + "1");
            }
        });


        grid.add(input);
        grid.add(panel);

        frame.add(grid);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Form();
    }

}
