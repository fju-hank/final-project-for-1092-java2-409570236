package com.fju.prpack;

public class Pack2 extends Pack{

    public Pack2(){
        name = "pants";
        comName = "com2";
        awb = "75477977125035";
        value = 300;
        kg = 2.4;
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
