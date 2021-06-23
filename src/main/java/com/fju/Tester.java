package com.fju;

import com.fju.prpack.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入倉儲編號:");
        int pk;
        pk = scan.nextInt();


        if (pk == 1) {
            System.out.println();
            System.out.println("以下為倉儲編號[" + pk + "]內的所有包裹項目:");
            Pack[] p = {new Pack1(), new Pack2(), new Pack3(), new Pack4(), new Pack5()};
            System.out.println("No. Name    Weight");
            for (int i = 0; i < 5; i++) {
                p[i].print();
            }



            System.out.println();
            System.out.println("輸入想查詢的包裹明細，結束此功能請輸入99");
            int nonum;
            nonum = scan.nextInt();
            if(-1 < nonum && nonum < 99){
                System.out.println("下列為包裹[" + nonum + "]的詳細資料");
                p[nonum].printnum();
            }else {
                System.out.println("end");
            }




        } else {
            System.out.println("查無此倉庫資料");
        }


    }
}
