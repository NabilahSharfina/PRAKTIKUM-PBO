package com.NabilahSharfina.Modul1.Praktikum.Objek;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        mahasiswaTanpa.setNama("Nabilah");
        mahasiswaTanpa.setNim(19104025);

        //Output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());
        System.out.println();

        //Deklaraasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Sharfina", 19104008);
        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }
}
