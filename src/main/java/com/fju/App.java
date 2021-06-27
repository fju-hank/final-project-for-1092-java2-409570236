package com.fju;

import com.fju.prpack.*;

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
    private JButton 清除Button;

    public App() {
        Pack[] packs = {new Pack1(), new Pack2(), new Pack3(), new Pack4(), new Pack5()};


        確認Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idText.getText().trim();
                packPrint.setText( id + "您好，歡迎使用。\n" + "以下為您的所有包裹項目:" + "\n" +
                        "Name" + "\t" + "Company" + "\t" + "AWB" + "\t" + "Value" + "\t"+ "Weight" +"\n"
                        /*
                        +
                        for (int i = 0; i < 5; i++) {
                            packs[i].printnum();
                        }
                        */
                );
            }
        });


        清除Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idText.setText("");
                packPrint.setText("");
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
