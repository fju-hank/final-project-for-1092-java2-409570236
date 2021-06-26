package com.fju;

import com.fju.prpack.*;

import java.util.Scanner;

public class NewTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("輸入您的身分id:");
        String username = scan.next();
        System.out.println(username + "您好，歡迎使用。");

        Pack[] packs = {new Pack1(), new Pack2(), new Pack3(), new Pack4(), new Pack5()};
            System.out.println();
            System.out.println("以下為您的所有包裹項目:");
            System.out.println("No. Name    Weight");
            for (int i = 0; i < 5; i++) {
                packs[i].print();
            }

            float sumkg = 0;
        for (int i = 0; i < 5; i++) {
            sumkg = (float) (sumkg + packs[i].printkg());
        }
        System.out.println("總重量: " + sumkg);

        System.out.println("選擇海運輸入0，選擇空運輸入1");
            int tran = scan.nextInt();
            if(tran == 0){

                System.out.println("運費價格為");
            }else if ( tran == 1 ){
                System.out.println("");
            }else {
                System.out.println("");
            }















        int total = 0;
        int n = -1;
        while(n != 0) {
            System.out.println("輸入儲值金額(輸入0結束功能):");
            String s = scan.next();
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
