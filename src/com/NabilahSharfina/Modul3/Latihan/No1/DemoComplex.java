package com.NabilahSharfina.Modul3.Latihan.No1;

/**
 * by Nabilah Sharfina
 * Menggunakan Asosiasi
 */

public class DemoComplex {
    public static void main(String[] args) {
        //Membuat objek rumah
        House A = new House("Blok June", "Khan", 4);
        House B = new House("Blok May", "Punjabi", 5);
        House C = new House("Blok November", "Khan", 4);

        //Membuat objek komplek
        Complex complex = new Complex("Residence", "INDRAPRASTA");
        //OUTPUT
        complex.addHouse(A.getIdHouse());
        complex.addHouse(B.getIdHouse());
        complex.addHouse(C.getIdHouse());

        //Menambah inputan data rumah
        complex.addHouse(new House("Blok Oktober", "Singh", 9).getIdHouse());

        //Memanggil getDataComplex melalui objek complex
        complex.getDataComplex();
    }
}