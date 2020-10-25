package com.NabilahSharfina.Modul2.Latihan.No2;

/**
 * By Nabilah Sharfina
 * Memanggil Method di Setiap Class Menggunakan Inheritance
 */

public class Cat extends Animals {
    //Deklarasi Variabel
    public String name_cat;

    //Constructor pertama dengan parameter bertipe data String
    public Cat(String name_cat) {
        this.name_cat = name_cat;
    }

    /*
     * Menggunakan annotation override
     * Menggunakan method getName dari class Animals
     */
    @Override
    public void getName(){
        System.out.println("The Name of Cat\t\t: " + name_cat);
    }

    //Method
    public void getVoice(){
        System.out.println(name_cat + " always meows in the dorm when she's spoiled");
        System.out.println();
    }
}
