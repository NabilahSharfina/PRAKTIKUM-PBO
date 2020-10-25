package com.NabilahSharfina.Modul1.Praktikum.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of object
        Manusia arrayManusia[] = new Manusia[3];

        //Constructor Pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Will");
        manusia1.setUmur(26);

        //Constructor Kedua
        Manusia manusia2 = new Manusia("Lucy");

        //Constructor Ketiga
        Manusia manusia3 = new Manusia("Louis", 21);

        arrayManusia[0]= manusia1;
        arrayManusia[1]= manusia2;
        arrayManusia[2]= manusia3;

        for (Manusia x : arrayManusia){
            System.out.println("Character");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
            System.out.println();
        }
    }
}