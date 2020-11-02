package com.NabilahSharfina.Modul4.Praktikum.Abstract;

import java.util.Random;

public class DemoBinatang {
    public static void main(String[] args) {
        //Arrray Objek
        Binatang[] peliharaan = {
                new Burung("Merpati"),
                new Kucing("Anggora"),
                new Anjing("Bulldog"),
                new Domba("Texel")
        };

        Binatang kesayangan;

        Random pilihan = new Random();

        kesayangan = peliharaan [pilihan.nextInt(peliharaan.length)];
        System.out.println("Binatang kesayangan\t: " + kesayangan);
        System.out.print("Suaranya\t\t\t: ");
        kesayangan.suara();
    }
}
