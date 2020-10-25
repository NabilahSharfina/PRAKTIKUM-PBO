package com.NabilahSharfina.Modul1.Praktikum.Method;

public class TestPass {
    int nomor1, nomor2;

    //Constructor
    public TestPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //Passed by value, parameter berupa tipe data primitif
    public void calculate(int m, int n){
        m = m * 10;
        n = n / 2;
    }

    //Passed by reference, parameter berupa tipe data class
    public void calculate(TestPass pass){
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 / 2;
    }
}
