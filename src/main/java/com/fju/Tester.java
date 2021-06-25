package com.fju;

import com.fju.prpack.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入倉儲編號:");
        int pk;
        pk = scan.nextInt();
        Pack[] p = {new Pack1(), new Pack2(), new Pack3(), new Pack4(), new Pack5()};

        if (pk == 1) {
            System.out.println();
            System.out.println("以下為倉儲編號[" + pk + "]內的所有包裹項目:");
            System.out.println("No. Name    Weight");
            for (int i = 0; i < 5; i++) {
                p[i].print();
            }



            System.out.println();
            int desnum =0;


            while( desnum != 99) {
                System.out.println();
                System.out.println("輸入想查詢的包裹明細，前往下一個功能請輸入99");
                desnum = scan.nextInt();
                System.out.println();
                System.out.println("下列為包裹[" + desnum + "]的詳細資料");
                p[desnum].printnum();
            }
            int pktake = 0;
            int sumkg = 0;
            while(pktake != 99) {
                sumkg += pktake;
                System.out.println();
                System.out.println("輸入想集運的包裹編號(結束請輸入99)");
                pktake = scan.nextInt();
            }
            System.out.println("目前重量 :" + sumkg);



/*
            System.out.println();
            System.out.println("輸入想集運的包裹編號(結束請輸入99)");
            int sumkg = 0;
            int pktnumber = 0;
            pktnumber = scan.nextInt();
            if( pktnumber < 99) {
                sumkg = sumkg + pktnumber;
                System.out.print("目前重量 : " + p[pktnumber].printkg() );
                System.out.print("\n");
            }else{
                System.out.println("結束");
            }
*/




        } else {
            System.out.println("查無此倉庫資料");
        }


    }
}
