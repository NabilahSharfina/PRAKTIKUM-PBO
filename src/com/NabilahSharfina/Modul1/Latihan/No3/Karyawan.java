package com.NabilahSharfina.Modul1.Latihan.No3;

/**
 * By Nabilah Sharfina
 * Program Detail Karyawan
 * (Menggunakan Class)
 */

public class Karyawan {
    //Tipe data
    private String name, gender, status, position;
    private int age;
    private double salary;

    //Constructor dengan parameter
    public Karyawan(String name, String gender, String status, String position, int age, double salary) {
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    //Method 1
    public String getName() {
        return name;
    }

    //Method 2
    public String getGender() {
        return gender;
    }

    //Method 3
    public String getStatus() {
        return status;
    }

    //Method 4
    public String getPosition() {
        return position;
    }

    //Method 5
    public int getAge() {
        return age;
    }

    //Method 6
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return("Hello everyone, my name is " + this.getName() + ". \nNow, my age is " + this.getAge()
                + ". \nMy gender is " + this.getGender() + ". \nMy status " + this.getStatus()
                + ". \nIn this place, I work as a " + this.getPosition()
                + ". \nI get income of around " + this.getSalary() + " rupiahs / month.");
    }
}
