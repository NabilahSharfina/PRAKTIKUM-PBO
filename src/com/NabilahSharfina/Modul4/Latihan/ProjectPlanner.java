package com.NabilahSharfina.Modul4.Latihan;

/**
 * @author Nabilah Sharfina
 * Menggunakan Konsep Abstract Class
 */

public class ProjectPlanner extends Employee {
    //Atribut
    private String name;
    private int nip;
    private long mainSalary, bonus, totalResult;

    //Constructor
    public ProjectPlanner(String name, int nip, long mainSalary, long bonus, long totalResult) {
        super("Project Planner");
        this.name = name;
        this.nip = nip;
        this.mainSalary = mainSalary;
        this.bonus = bonus;
        this.totalResult = totalResult;
    }

    /*
        Implements Method
        */
    @Override
    protected long countSalary() {
        //Menghitung rumus pajak
        double temptax = mainSalary * 0.05;
        long tax = (long) temptax;
        return mainSalary + (bonus * totalResult) - tax;
    }

    @Override
    protected void printInfo() {
        System.out.println("Name\t\t: " + name);
        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("Position\t: " + super.position);
        System.out.println("Salary\t\t: Rp " + countSalary());
    }
}
