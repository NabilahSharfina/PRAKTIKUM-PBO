package com.NabilahSharfina.Modul2.Latihan.No2;

/**
 * By Nabilah Sharfina
 * Memanggil Method di Setiap Class Menggunakan Inheritance
 */

public class Animals {
    //Mendeklarasikan method getName di class animals
    public void getName(){
        System.out.println("The name of animals!");
    }

    //Mendeklarasikan method getHabit di class animals
    public void getHabit(String eat, String sleep){
        System.out.println("Eat\t\t\t\t\t: " + eat);
        System.out.println("Sleep\t\t\t\t: " + sleep);
    }
}
