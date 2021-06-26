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
        System.out.println("[輸入您的身分]");
        String username = scan.next();
        System.out.println();
        System.out.println(username + "您好，歡迎使用。");


            System.out.println("以下為您的所有包裹項目:");
            System.out.println("Name" + "\t" + "Company" + "\t" + "AWB" + "\t\t\t\t" + "Value" + "\t"+ "Weight");
            for (int i = 0; i < 5; i++) {
                packs[i].printnum();
            }

            float sumkg = 0;
        for (int i = 0; i < 5; i++) {
            sumkg = (float) (sumkg + packs[i].printkg());
        }
        System.out.println("總重量: " + sumkg);

        run.tran();
        int tran_price =0;

        System.out.println("[選擇海運輸入0，選擇空運輸入1]");
            int tran_choose = scan.nextInt();
            if(tran_choose == 0){
                tran_price = (int) (Math.ceil(sumkg*1.0)/1.0)*45;
                System.out.println("運費價格為" + tran_price );
            }else if ( tran_choose == 1 ){
                tran_price = (int) (((Math.ceil(sumkg*1.0)/1.0)-1)*85)+120;
                System.out.println("運費價格為" + tran_price );
            }else {
                System.out.println("輸入值無效");
            }



        System.out.println("[是否要加購包裹附加服務，是輸入0，否輸入1]");
        int service_choose1 = scan.nextInt();
        int total_sservice =0;
        int service_choose2 =-1;

        if(service_choose1 == 0) {
            run.service();
            while (service_choose2 != 0) {

                System.out.println("請選擇服務(輸入0結束功能)");
                String ss = scan.next();
                service_choose2 = Integer.parseInt(ss);
                if (service_choose2 == 1) {
                    total_sservice = total_sservice + 25;
                } else if (service_choose2 == 2) {
                    total_sservice = total_sservice + 50;
                } else if (service_choose2 == 3) {
                    total_sservice = total_sservice + 75;
                } else if (service_choose2 == 4) {
                    total_sservice = total_sservice + 100;
                }else {
                    System.out.println("(輸入值無效)");
                }
                System.out.println("(已輸入)");
            }
        }    else if ( service_choose1 == 1 ){
        }else {
            System.out.println("輸入無效");
        }



        int total = (tran_price + total_sservice);
        System.out.println("總費用:" + total);
        int total_coin = 0;
        int n = -1;
        while(n != 0) {
            System.out.println("輸入儲值金額:");
            String s = scan.next();
            n = Integer.parseInt(s);
                total_coin = total_coin + n;
                System.out.println("目前金額: " + total_coin);
                if(total_coin > (total-1)){
                    System.out.println("可付款(輸入0結束功能)");
                }else {
                    System.out.println("繼續加值");
                }
        }
        System.out.println("已付款。剩餘金額:" + (total_coin - total) + "元");
        System.out.println("[填寫備註]");
        String ps = scan.next();

        System.out.println("=====================================\n" + "訂單編號:" );
        run.ordernum();
        System.out.println( "\n" +"使用者:" + "\n" + username + "\n" + "集運包裹:" );
        System.out.println("No." +"\t" + "Name" + "\t" +"Weight");
                for (int i = 0; i < 5; i++) {
                   packs[i].print();
                }
        System.out.println("\n" + "運費:" + tran_price + "元" + "\n" + "包裹附加服務:" + total_sservice + "元" + "\n" + "備註:" + ps );









    }



}
