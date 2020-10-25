package com.NabilahSharfina.Modul2.Latihan.No2;

/**
 * By Nabilah Sharfina
 * Memanggil Method di Setiap Class Menggunakan Inheritance
 */

public class DemoAnimals {
    public static void main(String[] args) {
        System.out.println("==========INHERITANCE OF ANIMALS==========");
        Bird $bird = new Bird("Eagle");//membuat objek dari class Bird
        //OUTPUT
        $bird.getName();//Memanggil method getName beserta outputnya
        $bird.getHabit("Meat", "At night");//Membuat argumen untuk menentukan nilai dari method
        $bird.getFly();//Memanggil method getFly beserta outputnya

        Fish $fish = new Fish("Shark");//membuat objek dari class Fish
        //OUTPUT
        $fish.getName();//Memanggil method getName beserta outputnya
        $fish.getHabit("Plankton", "In water");//Membuat argumen untuk menentukan nilai dari method
        $fish.getSwim();//Memanggil method getSwim beserta outputnya

        Cat $cat = new Cat("Lili");//membuat objek dari class Cat
        //OUTPUT
        $cat.getName();//Memanggil method getName beserta outputnya
        $cat.getHabit("Milk or biscuit", "On basket");//Membuat argumen untuk menentukan nilai dari method
        $cat.getVoice();//Memanggil method getVoice beserta outputnya
    }
}
