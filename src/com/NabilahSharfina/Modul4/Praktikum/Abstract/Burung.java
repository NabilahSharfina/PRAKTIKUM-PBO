package com.NabilahSharfina.Modul4.Praktikum.Abstract;

public class Burung extends Binatang{
    private String nama;

    Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    //Mendefinisikan methood abstract dengan menuliskan perintah di dalamnya
    public void suara(){
        System.out.println("Berkicau");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
}
