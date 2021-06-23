package com.fju;

import com.fju.prpack.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入倉儲編號:");
        int pk;
        pk = scan.nextInt();


        if(pk==1){
            System.out.println("以下為倉儲編號["+ pk + "]內的所有包裹項目:");
            Pack[] p = {new Pack1(), new Pack2(), new Pack3(), new Pack4()};
            System.out.println("No. Name    Weight" );
            for (int i = 0; i < 3; i++) {
                p[i].print();
            }
        }else {
            System.out.println("查無此倉庫資料");
        }





    }
}
