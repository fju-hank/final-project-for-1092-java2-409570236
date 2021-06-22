package com.fju.prpack;

public class Pack1 extends Pack{

    public Pack1(){
        name = "clothes";
        comName = "com1";
        awb = "SF1323237989149";
        value = 168;
        kg = 1.89;
    }

    void printName(String name){
        this.name = name;
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
