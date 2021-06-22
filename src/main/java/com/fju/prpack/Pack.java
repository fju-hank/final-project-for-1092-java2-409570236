package com.fju.prpack;

public abstract class Pack {

    String name;
    String comName;
    String awb;
    int value;
    double kg;


    public Pack(){
        super();
    }

    public Pack(String name,String comName,String awb, int value, float kg) {
        this.name = name;
        this.comName = comName;
        this.awb = awb;
        this.value = value;
        this.kg = kg;
    }

    public void print() {
        System.out.println(name + "\t" + comName + "\t" + awb + "\t" + value + "\t" + kg );
    }

    public void printName() {
        System.out.println(name);
    }

    public abstract String getName();

    public abstract int getPrice();

    }

