package com.NabilahSharfina.Modul4.Praktikum.Abstract;

public class Anjing extends Binatang {
    private String nama;

    Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }

    //Mendefinisikan methood abstract dengan menuliskan perintah di dalamnya
    public void suara(){
        System.out.println("Menggonggong");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
}
