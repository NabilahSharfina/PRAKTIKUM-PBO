package com.NabilahSharfina.Modul2.Praktikum.Overriding;

public class DemoOverriding {
    public static void main(String[] args) {
        X superclass = new X();
        Y subclass = new Y();

        superclass.getValue("Mati listrik");
        subclass.getValue("Mati lampu");
    }
}
