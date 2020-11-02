package com.NabilahSharfina.Modul4.Praktikum.Interface;

public class CD {
    String ukuran;
    long hargaCD;

    public CD(String ukuran, long hargaCD) {
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }

    public long getHargaCD() {
        return hargaCD;
    }

    public void cetakCD(){
        System.out.println("Ukuran CD\t: " + ukuran);
        System.out.println("Harga CD\t: " + hargaCD);
        System.out.println();
    }
}
