package com.NabilahSharfina.Modul4.Praktikum.Abstract;

public class Kucing extends Binatang {
    private String nama;

    Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }

    //Mendefinisikan methood abstract dengan menuliskan perintah di dalamnya
    public void suara(){
        System.out.println("Mengeong");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
}
