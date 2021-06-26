package com.fju;

import com.fju.prpack.*;

import java.util.Scanner;
import java.lang.*;
import java.lang.Math;

public class NewTester {
    public static void main(String[] args) {
        Pack[] packs = {new Pack1(), new Pack2(), new Pack3(), new Pack4(), new Pack5()};
        Run run = new Run();

        Scanner scan = new Scanner(System.in);
        System.out.println("[輸入您的身分id]");
        String username = scan.next();
        System.out.println(username + "您好，歡迎使用。");


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

        run.tran();
        System.out.println("[選擇海運輸入0，選擇空運輸入1]");
            int tran_choose = scan.nextInt();
            if(tran_choose == 0){
                int tran_price = (int) (Math.ceil(sumkg*1.0)/1.0)*45;
                System.out.println("運費價格為" + tran_price );
            }else if ( tran_choose == 1 ){
                int tran_price = (int) (((Math.ceil(sumkg*1.0)/1.0)-1)*85)+120;
                System.out.println("運費價格為" + tran_price );
            }else {
                System.out.println("輸入無效");
            }



        System.out.println("[是否要加購包裹附加服務，是輸入0，否輸入1]");
        int service_choose1 = scan.nextInt();
        int total_sservice =0;
        int service_choose2 =-1;

        if(service_choose1 == 0){
            run.service();
            while(service_choose2 != 0) {

                System.out.println("請選擇服務(輸入0結束功能)");
                String ss = scan.next();
                service_choose2 = Integer.parseInt(ss);
                total_sservice = total_sservice + service_choose2;
                System.out.println("目前選擇: " + total_sservice);
            }

        }else if ( service_choose1 == 1 ){
        }else {
            System.out.println("輸入無效");
        }















        int total = 0;
        int n = -1;
        while(n != 0) {
            System.out.println("輸入儲值金額(輸入0結束功能):");
            String s = scan.next();
            n = Integer.parseInt(s);
                total = total + n;
                System.out.println("目前金額: " + total);
        }
        System.out.println("感謝使用。");
    }


}
