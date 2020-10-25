package com.NabilahSharfina.Modul2.Praktikum.Overloading;

public class DemoSong {
    public static void main(String[] args) {
        Song lagu1 = new Song("Without You", "G-Dragon BIGBANG");
        Song lagu2 = new Song("Runaway", "Eric Nam");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
