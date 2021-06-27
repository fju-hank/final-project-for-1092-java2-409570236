package com.fju;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panelMain;
    private JPanel topPanel;
    private JPanel buttomPanel;
    private JTextField idText;
    private JTextArea packPrint;
    private JButton 確認Button;
    private JButton 取消Button;

    public App() {
        確認Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idText.getText().trim();
                packPrint.setText( id + "您好，歡迎使用。" );
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setLocation(450, 250);
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
