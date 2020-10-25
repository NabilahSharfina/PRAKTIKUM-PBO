package com.NabilahSharfina.Modul1.Praktikum.Method;

public class Passed {
    public static void main(String[] args) {
        int nomor1, nomor2;

        TestPass pass = new TestPass(50, 100); //Deklarasi objek
        nomor1 = 10;
        nomor2 = 20;

        //Passed by value
        System.out.println("Nilai sebelum passed by value");
        System.out.println("Nomor1\t: " + nomor1);
        System.out.println("Nomor2\t:= " + nomor2);
        System.out.println();

        pass.calculate(nomor1, nomor2);
        System.out.println("Nilai sesudah passed by value");
        System.out.println("Nomor1\t: " + nomor1);
        System.out.println("Nomor2\t: " + nomor2);
        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by reference");
        System.out.println("Pass Nomor1\t: " + pass.nomor1);
        System.out.println("Pass Nomor2\t: " + pass.nomor2);
        System.out.println();

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference");
        System.out.println("Pass Nomor1\t: " + nomor1);
        System.out.println("Pass Nomor2\t: " + nomor2);
    }
}
