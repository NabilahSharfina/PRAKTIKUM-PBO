package com.NabilahSharfina.Modul2.Praktikum.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Masukkan data ke Super Class");
        superclass.x = 5;
        superclass.y = 8;
        superclass.printXY();

        System.out.println("\nMasukkan data ke Sub Class");
        subclass.x = 0;
        subclass.y = 25;
        subclass.z = 45;
        subclass.printXY();
        subclass.sumValue();
    }
}
