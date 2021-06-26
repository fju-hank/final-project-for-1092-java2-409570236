package com.fju;

import com.fju.prpack.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入倉儲編號:");
        int pk;
        pk = scan.nextInt();
        //Run run =new Run();
        Pack[] packs = {new Pack1(), new Pack2(), new Pack3(), new Pack4(), new Pack5()};


        if (pk == 1) {
            System.out.println();
            System.out.println("以下為倉儲編號[" + pk + "]內的所有包裹項目:");
            System.out.println("No. Name    Weight");
            for (int i = 0; i < 5; i++) {
                packs[i].print();
            }
        } else {
            System.out.println("查無此倉庫資料，謝謝您的使用。");
        }

        //run.despack();
        //run.takepack();
        int pktake = -1;
        double pktake_kg;
        double sumkg = 0;
        while (pktake == 0 || pktake == 1 || pktake == 2 || pktake == 3 || pktake == 4 || pktake == 5 ||pktake != 99) {
            System.out.println("輸入想集運的包裹編號(結束請輸入99)");
            String s = scan.next();
            pktake = Integer.parseInt(s);
            if (pktake == 0 || pktake == 1 || pktake == 2 || pktake == 3 || pktake == 4 || pktake == 5) {
                pktake_kg = packs[pktake].printkg();
                sumkg = sumkg + pktake_kg;
                System.out.println("目前重量 :" + sumkg);
                if (sumkg > 15) {
                    System.out.println("a) $10");
                }
                if (sumkg > 20) {
                    System.out.println("b) $20");
                }
                if (sumkg > 23) {
                    System.out.println("c) $23");
                }
            }
        }
        System.out.println("Bye");



    }

    }

