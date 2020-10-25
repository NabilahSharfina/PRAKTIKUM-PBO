package com.NabilahSharfina.Modul2.Latihan.No2;

/**
 * By Nabilah Sharfina
 * Memanggil Method di Setiap Class Menggunakan Inheritance
 */

public class Bird extends Animals{
    //Deklarasi Variabel
    public String name_bird;

    //Constructor pertama dengan parameter bertipe data String
    public Bird(String name_bird) {
        this.name_bird = name_bird;
    }

    /*
    * Menggunakan annotation override
    * Menggunakan method getName dari class Animals
     */
    @Override
    public void getName(){
        System.out.println("The Type of Bird\t: " + name_bird);
    }

    //Method
    public void getFly(){
        System.out.println("Look up in the sky it's bird like a plane, yeah");
        System.out.println();
    }
}
