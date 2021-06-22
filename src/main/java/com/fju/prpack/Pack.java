package com.fju.prpack;

public class Pack {
    String name;
    String comName;
    String awb;
    int value;
    int kg;


    public Pack(){
        super();
    }

    public Pack(String name,String comName,String awb, int value, int kg) {
        this.name = name;
        this.comName = comName;
        this.awb = awb;
        this.value = value;
        this.kg = kg;
    }

    public void print() {
        System.out.println(name + "\t" + comName + "\t" + awb + "\t" + value + "\t" + kg);
    }


    }

