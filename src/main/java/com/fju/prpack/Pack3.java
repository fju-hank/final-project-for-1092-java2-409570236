package com.fju.prpack;

public class Pack3 extends Pack{

    public Pack3(){
        no = "002";
        name = "glasses";
        comName = "com3";
        awb = "4315334441437";
        value = 250;
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
