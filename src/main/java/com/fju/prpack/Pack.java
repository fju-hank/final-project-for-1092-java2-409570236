package com.fju.prpack;

public abstract class Pack {

    String no;
    String name;
    String comName;
    String awb;
    int value;
    double kg;

    public Pack(){
        super();
    }

    public Pack(String no,String name,String comName,String awb, int value, float kg) {
        this.no = no;
        this.name = name;
        this.comName = comName;
        this.awb = awb;
        this.value = value;
        this.kg = kg;
    }

    public void print() {
        System.out.println(no + "\t" + name + "\t" + kg );
    }

    public void printnum() {
        System.out.println("Name    Company AWB             Value   Weight");
        System.out.println(name + "\t" + comName + "\t" + awb + "\t" + value + "\t\t" + kg );
    }

    public double printkg() {
        return kg;
    }

    public abstract String getName();

    public abstract int getPrice();

    }

