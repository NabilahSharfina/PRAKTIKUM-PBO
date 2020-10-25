package com.NabilahSharfina.Modul1.Latihan.No2;

/**
 * By Nabilah Sharfina
 * Program Pendaftaran Mahasiswa Baru
 * (Menggunakan Constructor)
 */

public class DemoMaBa {
    public static void main(String[] args) {
        System.out.println("==========STUDENT REGISTRATION==========");
        System.out.println("<<<WELCOME TO ANKARA UNIVERSITY>>>");
        /*
        Deklarasi objek dengan parameter
        Output Mahasiswa Baru 1
         */
        DaftarMaBa maba1 = new DaftarMaBa("Burak", "Ankara", "Music", 90400897, 22);
        System.out.println("New Student 1");
        System.out.println("Name\t: " + maba1.getNama());
        System.out.println("Age\t\t: " + maba1.getUmur());
        System.out.println("Number\t: " + maba1.getNomor());
        System.out.println("Address\t: " + maba1.getAsal());
        System.out.println("Major\t: " + maba1.getProdi());
        System.out.println();

        /*
        Deklarasi objek dengan parameter
        Output Mahasiswa Baru 2
         */
        DaftarMaBa maba2 = new DaftarMaBa("Cansu", "Istanbul", "Acting", 90080488, 19);
        System.out.println("New Student 2");
        System.out.println("Name\t: " + maba2.getNama());
        System.out.println("Age\t\t: " + maba2.getUmur());
        System.out.println("Number\t: " + maba2.getNomor());
        System.out.println("Address\t: " + maba2.getAsal());
        System.out.println("Major\t: " + maba2.getProdi());
        System.out.println();

        /*
        Deklarasi objek dengan parameter
        Output Mahasiswa Baru 3
         */
        DaftarMaBa maba3 = new DaftarMaBa("Alina", "Edirne", "Desaign", 90104588, 24);
        System.out.println("New Student 3");
        System.out.println("Name\t: " + maba3.getNama());
        System.out.println("Age\t\t: " + maba3.getUmur());
        System.out.println("Number\t: " + maba3.getNomor());
        System.out.println("Address\t: " + maba3.getAsal());
        System.out.println("Major\t: " + maba3.getProdi());
    }
}
