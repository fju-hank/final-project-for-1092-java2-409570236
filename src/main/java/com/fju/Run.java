package com.fju;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

    public void tran(){
        System.out.println("=====================================\n" +
                "[海運]\n" +
                "NT.45/kg (未滿1kg以1kg計算)\n" +
                "[空運]\n" +
                "首重: NT.120/kg \n" +
                "續種: NT.85/kg (未滿1kg以1kg計算)\n" +
                "=====================================");
    }

    public void service(){
        System.out.println("=====================================\n" +
                "1)包裝氣泡棉 $25\n" +
                "2) 開相拍照 $50\n" +
                "3) 開箱驗貨 $75\n" +
                "4) 特殊需求 $100\n" +
                "=====================================");
    }

    public void ordernum(){
        int i;
        int[] order_number = new int[12];

        for(i = 0; i < 12; i++){
            if(i < 3){
                order_number[i]=(int)((Math.random()*26)+97);
            }else{
                order_number[i] = ((int)(int)((Math.random()*10)+48));
            }
        }
        System.out.print("訂單編號:" + "\t");
        for(i = 0; i < 12; i++){
            System.out.print((char)order_number[i]);
        }
    }

    public void nowTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date current = new Date();
        System.out.println("\n" + "現在時間:"+ "\t" + sdFormat.format(current));
    }

}












