package com.NabilahSharfina.Modul4.Praktikum.Abstract;

public class Domba extends Binatang {
    private String nama;

    Domba(String nama) {
        super("Domba");
        this.nama = nama;
    }

    //Mendefinisikan methood abstract dengan menuliskan perintah di dalamnya
    public void suara(){
        System.out.println("Embek");
    }

    public String toStrig(){
        return super.toString() + " " + nama;
    }
}
