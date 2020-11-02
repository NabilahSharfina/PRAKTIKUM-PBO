package com.NabilahSharfina.Modul3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Ricky");
        mahasiswa1.setNim(20890456);

        Mahasiswa mahasiswa2 = new Mahasiswa("Eko", 22178450);

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");
        dosen.setNimMahasiswa(mahasiswa1.getNim());
        dosen.setNimMahasiswa(mahasiswa2.getNim());

        System.out.println("Kode Dosen\t\t\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiwa\t: ");

        for (int i = 0; i < dosen.getJumlahMahasiswa(); i++) {
            System.out.println("- " + dosen.getnimMahasiswa(i));
        }
    }
}
