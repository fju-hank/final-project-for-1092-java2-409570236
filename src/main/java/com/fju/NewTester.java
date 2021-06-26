package com.fju;

import com.fju.prpack.*;

import java.util.Scanner;

public class NewTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入您的身分id:");
        String username = scanner.next();
        System.out.println(username + "您好，歡迎使用。");

        Pack[] packs = {new Pack1(), new Pack2(), new Pack3(), new Pack4(), new Pack5()};
            System.out.println();
            System.out.println("以下為您的所有包裹項目:");
            System.out.println("No. Name    Weight");
            for (int i = 0; i < 5; i++) {
                packs[i].print();
            }


        int total = 0;
        int n = -1;
        while(n != 0) {
            System.out.println("輸入儲值金額(輸入0結束功能):");
            String s = scanner.next();
            n = Integer.parseInt(s);
                total = total + n;
                System.out.println("目前金額: " + total);
                if(n != 0 )
                if (total > 24) {
                    System.out.println("附加服務:");
                    System.out.println("a) 包裝氣泡棉 $25");
                    if (total > 49){
                        System.out.println("b) 開相拍照 $50");
                    }
                    if (total > 74) {
                        System.out.println("c) 開箱驗貨 $75");
                    }
                    if (total > 99) {
                        System.out.println("d) 特殊需求 $100");
                    }
                }


        }
        System.out.println("感謝使用。");
    }


}
