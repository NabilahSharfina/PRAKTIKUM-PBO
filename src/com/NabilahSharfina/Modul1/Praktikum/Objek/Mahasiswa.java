package com.NabilahSharfina.Modul1.Praktikum.Objek;

public class Mahasiswa {
    String nama;
    int nim;

    //Constructor
    public Mahasiswa(){}

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter
    public int getNim() {
        return nim;
    }

    //Setter
    public void setNim(int nim) {
        this.nim = nim;
    }
}