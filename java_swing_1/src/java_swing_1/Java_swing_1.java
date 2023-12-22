/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_swing_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Advie Rifaldy
 */
public class Java_swing_1 extends JFrame {

    JButton btn1 = new JButton("Copy");
    JTextArea textarea = new JTextArea(10, 10);
    JTextArea textarea2 = new JTextArea(10, 10);
    JLabel label = new JLabel();

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int ANIMATION_DELAY = 100; // Delay dalam milidetik (ms)

    private static int red = 255;
    private static int green = 0;
    private static int blue = 0;

    private static Random random = new Random();

    Java_swing_1() {
//        super("INI FORM");
//        setTitle("Java Swing 1");
        setTitle("<html><font color='red'>Java Swing 1</font></html>");

        setLocation(400, 200);
        setSize(480, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private boolean isLabel = true;

    void tampilan() {

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setPreferredSize(new Dimension(480, 500));
        panel.setBorder(new EmptyBorder(100, 50, 300, 50)); // Menambahkan padding 10 piksel di setiap sisi

//        getContentPane().setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField(20);

        JButton saveButton = new JButton("Save");

        JToggleButton toggleButton = new JToggleButton("Outcome");
        toggleButton.setBackground(Color.red);
        toggleButton.setSelected(false);

        toggleButton.addActionListener(e -> {
            if (toggleButton.isSelected()) {
                toggleButton.setText("Income");
                toggleButton.setBackground(Color.GREEN);
                System.out.println("Toggle button is ON");
            } else {
                toggleButton.setText("Outcome");
                toggleButton.setBackground(Color.RED);
                System.out.println("Toggle button is OFF");
            }
        });

        JButton button = new JButton("Cancel");
        button.setPreferredSize(new Dimension(100, 50));

        animateSpin(button);
//        button.addMouseListener(new MouseAdapter() {
//            public void mouseEntered(MouseEvent e) {
//            }
//
//            public void mouseExited(MouseEvent e) {
//                stopSpin(button);
//            }
//        });

        Timer timer = new Timer(ANIMATION_DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateColor();
                panel.setBackground(new Color(red, green, blue));
                repaint();
            }
        });
        timer.start();

        panel.add(toggleButton);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(saveButton);
        panel.add(button);

        getContentPane().add(textarea);
        getContentPane().add(btn1);
        getContentPane().add(textarea2);
        getContentPane().add(label);

        textarea.append("Hello world");
        textarea2.append("");

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isLabel) {
                    label.setText("Hello World!");
                } else {
                    label.setText("-");
                }
                isLabel = !isLabel;
//                textarea2.append(textarea.getSelectedText());
            }
        });

        getContentPane().setLayout(new FlowLayout());
        setVisible(true);

    }

    private static void updateColor() {
        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
    }

    private static void animateSpin(JButton button) {
        Timer timer = new Timer(100, null);
        timer.addActionListener(e -> {
            Graphics2D g2d = (Graphics2D) button.getGraphics();
            g2d.rotate(Math.toRadians(10), button.getWidth() / 2, button.getHeight() / 2);
            button.paint(g2d);
        });
        timer.start();
        button.putClientProperty("spinTimer", timer);
    }

    private static void stopSpin(JButton button) {
        Timer timer = (Timer) button.getClientProperty("spinTimer");
        if (timer != null) {
            timer.stop();
            button.putClientProperty("spinTimer", null);
            button.repaint();
        }
    }

    public static void main(String[] args) {
        Java_swing_1 test = new Java_swing_1();
        test.tampilan();
    }
}
