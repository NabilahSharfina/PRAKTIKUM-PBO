package com.NabilahSharfina.Modul1.Latihan.No3;

/**
 * By Nabilah Sharfina
 * Program Detail Karyawan
 * (Menggunakan Class)
 */

public class DemoKaryawan {
    public static void main(String[] args) {
        Karyawan profil = new Karyawan("Sunny", "woman", "just single",
                "make up artist", 27, 4500000);//membuat objek
        System.out.println("===========DETAIL PROFIL KARYAWAN HWI ENTERTAINMENT==========");
        System.out.println();
        System.out.println(profil.toString());//memanggil objek dan method
        System.out.println();
        System.out.println("=====>>>THANK YOU<<<=====");
    }
}
