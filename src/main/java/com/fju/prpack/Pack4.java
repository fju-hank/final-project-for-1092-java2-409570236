package com.fju.prpack;

public class Pack4 extends Pack{

    public Pack4(){
        no = "003";
        name = "3";
        comName = "com4";
        awb = "123";
        value = 123;
        kg = 123;
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
