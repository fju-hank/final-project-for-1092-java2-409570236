package com.fju.prpack;

public class Pack5 extends Pack{

    public Pack5(){
        no = "4";
        name = "Shoes";
        comName = "com5";
        awb = "YT5565358325155";
        value = 560;
        kg = 2;
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
