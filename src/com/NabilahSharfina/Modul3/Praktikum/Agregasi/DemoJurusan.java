package com.NabilahSharfina.Modul3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("1040", "Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("23", "Sammy");
        Mahasiswa mahasiswa2 = new Mahasiswa("38", "Jacob");
        Mahasiswa mahasiswa3 = new Mahasiswa("25", "Eric");

        //List
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("80", "Riko"));

        //Untuk copas data dari list mahasiswa class DemoJurusan ke class Jurusan
        jurusan.setMahasiswaList(mahasiswaList);

        //Untuk masukan data dari data Mahasiswa langsung ke class Jurusan
        jurusan.addMahasiswa(mahasiswa3);

        //Menampilkan printData dari data Jurusan
        jurusan.printData();
    }
}
