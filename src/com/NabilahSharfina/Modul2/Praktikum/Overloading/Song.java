package com.NabilahSharfina.Modul2.Praktikum.Overloading;

public class Song {
    public String judul;
    public String pencipta;

    //Overloading
    public Song(String judul) {
        this.judul = judul;
    }

    //Overloading
    public Song(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
        System.out.println();
    }
}
