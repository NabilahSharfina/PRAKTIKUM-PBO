package com.NabilahSharfina.Modul1.Praktikum.Constructor;

public class Manusia {
    private String nama ;
    private int umur;

    //Constructor Pertama, default tanpa parameter
    public Manusia(){}

    //Constructor Kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //Constructor Ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Getter & Setter Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter & Setter Umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}