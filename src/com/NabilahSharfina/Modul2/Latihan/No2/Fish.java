package com.NabilahSharfina.Modul2.Latihan.No2;

/**
 * By Nabilah Sharfina
 * Memanggil Method di Setiap Class Menggunakan Inheritance
 */

public class Fish extends Animals {
    //Deklarasi Variabel
    public String name_fish;

    //Constructor pertama dengan parameter bertipe data String
    public Fish(String name_fish) {
        this.name_fish = name_fish;
    }

    /*
     * Menggunakan annotation override
     * Menggunakan method getName dari class Animals
     */
    @Override
    public void getName(){
        System.out.println("The Type of Fish\t: " + name_fish);
    }

    //Method
    public void getSwim(){
        System.out.println(name_fish + " usually swim from the bottom to the surfaces of the sea");
        System.out.println();
    }
}
