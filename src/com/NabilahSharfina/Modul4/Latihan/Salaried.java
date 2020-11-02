package com.NabilahSharfina.Modul4.Latihan;

/**
 * @author Nabilah Sharfina
 * Menggunakan Konsep Abstract Class
 */

public class Salaried extends Employee{
    //Atribut
    private String name;
    private int nip;
    private long weeksalary;

    //Constructor
    public Salaried(String name, int nip, long weeksalary) {
        super("Salaried Employee");
        this.name = name;
        this.nip = nip;
        this.weeksalary = weeksalary;
    }

    /*
        Implements Method
        */
    @Override
    protected long countSalary() {
        return weeksalary;
    }

    @Override
    protected void printInfo() {
        System.out.println("Name\t\t: " + name);
        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("Position\t: " + super.position);
        System.out.println("Salary\t\t: Rp " + countSalary());
    }
}
