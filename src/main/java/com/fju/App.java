package com.fju;

import javax.swing.*;

public class App {
    private JPanel panelain;
    private JButton 確認Button;
    private JPanel panel1;
    private JTextField textField1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JTextArea textArea1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setLocation(600, 350);
        frame.setContentPane(new App().panelain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
    }


}
