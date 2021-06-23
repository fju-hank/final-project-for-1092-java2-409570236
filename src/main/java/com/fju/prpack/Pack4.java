package com.fju.prpack;

public class Pack4 extends Pack{

    public Pack4(){
        no = "3";
        name = "Coat ";
        comName = "com4";
        awb = "773103745900444";
        value = 120;
        kg = 1.24;
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
