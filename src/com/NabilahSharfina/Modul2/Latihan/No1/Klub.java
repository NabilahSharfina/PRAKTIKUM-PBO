package com.NabilahSharfina.Modul2.Latihan.No1;

/**
 * By Nabilah Sharfina
 * Percobaan Overloading menggunakan 5 Constructor dan Method
 */

public class Klub {
    //Mendeskripsikan Variabel
    public String name;
    public int year;
    public String stadion;
    public int champion;
    public String description;

    //Constructor pertama tanpa parameter
    public Klub() {}

    //Constructor kedua dengan parameter bertipe data String
    public Klub(String name) {
        this.name = name;
    }

    //Constructor ketiga dengan parameter bertipe data String
    public Klub(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Constructor keempat dengan parameter bertipe ata String dan int
    public Klub(String name, int year, String stadion) {
        this.name = name;
        this.year = year;
        this.stadion = stadion;
    }

    //Constructor kelima dengan parameter bertipe ata String dan int
    public Klub(String name, int year, String stadion, int champion, String description) {
        this.name = name;
        this.year = year;
        this.stadion = stadion;
        this.champion = champion;
        this.description = description;
    }

    //Method getTeam
    public void getTeam(){
        System.out.println("Klub\t\t\t: " + name);
        System.out.println("Since\t\t\t: " + year);
        System.out.println("Stadium\t\t\t: " + stadion);
        System.out.println("UCL Champion\t: " + champion);
        System.out.println("Description\t\t: " + description);
        System.out.println();
    }
}
