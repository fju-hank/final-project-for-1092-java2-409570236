package com.fju.prpack;

public class Pack1 extends Pack{

    public Pack1(){
        no = "001";
        name = "clothes";
        comName = "com1";
        awb = "SF1323237989149";
        value = 168;
        kg = 1.89;
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
