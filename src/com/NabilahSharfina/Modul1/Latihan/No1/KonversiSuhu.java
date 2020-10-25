package com.NabilahSharfina.Modul1.Latihan.No1;

/**
 * By Nabilah Sharfina
 * Program Menghitung Konversi Suhu
 * (Menggunakan Method)
 */

public class KonversiSuhu {
    //Method dengan parameter, menggunakan tipe data integer
    void Celcius (int C){
        System.out.println("Konversi Suhu C -> F\t: " + ((C * 9 / 5) + 32));
    }

    void Fahrenheit (int F){
        System.out.println("Konversi Suhu F -> K\t: " + ((F - 32) * 5 / 9 + 273));
    }

    void Kelvin (int K){
        System.out.println("Konversi Suhu K -> R\t: " + ((K - 273) * 4 / 5));
    }

    void Reamur (int R){
        System.out.println("Konversi Suhu R -> C\t: " + (R * 5 / 4));
    }

    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();//Membuat objek
        System.out.println("=====PROGRAM KONVERSI SUHU=====");
        System.out.println();
        System.out.println("Menampilkan Hasil Konversi Suhu!");
        //Memanggil method Celcius, Fahrenheit, Kelvin, Reamur
        konversi.Celcius(25);
        konversi.Fahrenheit(5);
        konversi.Kelvin(32);
        konversi.Reamur(12);
    }
}
