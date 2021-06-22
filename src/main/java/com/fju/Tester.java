package com.fju;

import com.fju.prpack.*;

public class Tester {
    public static void main(String[] args) {

        Pack[] p = {new Pack1(), new Pack2(), new Pack3(), new Pack4()};

        System.out.println("Name     CompanyName     AWB           Price   Weight");
        for (int i = 0; i < 3; i++) {
            p[i].print();
        }



    }
}
