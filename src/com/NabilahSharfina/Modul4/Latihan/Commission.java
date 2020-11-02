package com.NabilahSharfina.Modul4.Latihan;

/**
 * @author Nabilah Sharfina
 * Menggunakan Konsep Abstract Class
 */

public class Commission extends Employee{
    //Atribut
    private String name;
    private int nip;
    private long mainsalary, bonus, totalSales;

    //Constructor
    public Commission(String name, int nip, long mainsalary, long bonus, long totalSales) {
        super("Commission Employee");
        this.name = name;
        this.nip = nip;
        this.mainsalary = mainsalary;
        this.bonus = bonus;
        this.totalSales = totalSales;
    }

    /*
        Implements Method
        */
    @Override
    protected long countSalary() {
        return mainsalary + (bonus * totalSales);
    }

    @Override
    protected void printInfo() {
        System.out.println("Name\t\t: " + name);
        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("Position\t: " + super.position);
        System.out.println("Salary\t\t: Rp " + countSalary());
    }
}
