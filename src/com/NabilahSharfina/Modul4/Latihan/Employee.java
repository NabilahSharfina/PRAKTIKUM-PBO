package com.NabilahSharfina.Modul4.Latihan;

/**
 * @author Nabilah Sharfina
 * Menggunakan Konsep Abstract Class
 */

public abstract class Employee {
    //Atribut
    public String position;

    //Constructor
    public Employee(String position){
        this.position = position;
    }

    //Method Abstract
    protected abstract long countSalary();

    //Method Abstract
    protected abstract void printInfo();
}
