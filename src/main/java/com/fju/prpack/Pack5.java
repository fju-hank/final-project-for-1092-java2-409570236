package com.fju.prpack;

public class Pack5 extends Pack{

    public Pack5(){
        no = "5";
        name = "5";
        comName = "com5";
        awb = "55";
        value = 55;
        kg = 55;
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
