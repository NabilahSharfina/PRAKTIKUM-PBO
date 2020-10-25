package com.NabilahSharfina.Modul1.Latihan.No2;

/**
 * By Nabilah Sharfina
 * Program Pendaftaran Mahasiswa Baru
 * (Menggunakan Constructor)
 */

public class DaftarMaBa {
    //Tipe data
    private String nama, asal, prodi;
    private long nomor;
    private int umur;

    //Constructor dengan parameter
    public DaftarMaBa(String nama, String asal, String prodi, long nomor, int umur) {
        this.nama = nama;
        this.asal = asal;
        this.prodi = prodi;
        this.nomor = nomor;
        this.umur = umur;
    }

    //Method 1
    public String getNama() {
        return nama;
    }

    //Method 2
    public String getAsal() {
        return asal;
    }

    //Method 3
    public String getProdi() {
        return prodi;
    }

    //Method 4
    public long getNomor() {
        return nomor;
    }

    //Method 5
    public int getUmur() {
        return umur;
    }
}
