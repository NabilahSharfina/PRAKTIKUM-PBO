package com.NabilahSharfina.Modul3.Praktikum.Asosiasi;

public class Dosen {
    private String kodeDosen;
    private int nimMahasiswa[] = new int[10];
    private int jumlahMahasiswa;

    public Dosen(){

    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public void setJumlahMahasiswa(int jumlahMahasiswa) {
        this.jumlahMahasiswa = jumlahMahasiswa;
    }

    public int getnimMahasiswa(int indeks){
        return (nimMahasiswa[indeks]);
    }

    public void setNimMahasiswa(int nim){
        nimMahasiswa[jumlahMahasiswa] = nim;
        jumlahMahasiswa++;
    }
}