package com.fju.prpack;

public class Pack3 extends Pack{

    public Pack3(){
        no = "2";
        name = "earring";
        comName = "com3";
        awb = "75477977125035";
        value = 210;
        kg = 1.45;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.value;
    }

}
