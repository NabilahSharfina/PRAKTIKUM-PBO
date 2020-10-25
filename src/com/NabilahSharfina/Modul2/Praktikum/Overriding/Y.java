package com.NabilahSharfina.Modul2.Praktikum.Overriding;

public class Y extends X {
    @Override
    public void getValue(String value){
        super.getValue(value);
        System.out.println("Value Y\t: " + value);
    }
}
