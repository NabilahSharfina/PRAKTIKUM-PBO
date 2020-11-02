package com.NabilahSharfina.Modul4.Praktikum.Abstract;

public abstract class Binatang {
    private String jenis;

    Binatang(String jenis) {
        this.jenis = jenis;
    }

    //Method Abstract
    protected abstract void suara();

    public String toString(){
        return "Seekor " + jenis;
    }
}
