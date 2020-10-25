package com.NabilahSharfina.Modul2.Latihan.No1;

/**
 * By Nabilah Sharfina
 * Percobaan Overloading menggunakan 5 Constructor dan Method
 */

public class DemoKlub {
    public static void main(String[] args) {
        //Membuat objek baru
        Klub football_1 = new Klub();//objek dengan constructor kosong
        Klub football_2 = new Klub("Liverpool");//objek dengan constructor 1 parameter
        Klub football_3 = new Klub("Ac Milan", "The second most successful team " +
                "in the history of Italian football");//objek dengan constructor 2 parameter
        Klub football_4 = new Klub("Bayern Munchen", 1900, "Allianz Arena");//objek dengan constructor 3 parameter
        Klub football_5 = new Klub("Real Madrid", 1902, "Santiago Bernabeu", 13,
                "One of the richest football clubs in the world");//objek dengan constructor 5 parameter

        //OUTPUT
        football_1.getTeam();//Memanggil method getTeam beserta output dari objek football_1
        football_2.getTeam();//Memanggil method getTeam beserta output dari objek football_2
        football_3.getTeam();//Memanggil method getTeam beserta output dari objek football_3
        football_4.getTeam();//Memanggil method getTeam beserta output dari objek football_4
        football_5.getTeam();//Memanggil method getTeam beserta output dari objek football_5
    }
}
