package com.NabilahSharfina.Modul3.Praktikum.Komposisi;

public class Keyboard {
    private String merk;
    private String type;

    public Keyboard(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    public void PrintSpec(){
        System.out.println("- Merk\t\t: " + merk);
        System.out.println("- Type\t\t: " + type);
        System.out.println();
    }
}
