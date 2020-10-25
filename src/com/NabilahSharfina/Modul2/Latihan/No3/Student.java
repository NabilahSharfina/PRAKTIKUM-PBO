package com.NabilahSharfina.Modul2.Latihan.No3;

/**
 * By Nabilah Sharfina
 * Membuat Objek dengan Menggunakan VMI
 */

public class Student extends Sweetheart {
    public String name = "Murat";
    public String status = "Boyfriend";
    public int semester = 2;

    //Method getStatus
    public void getStatus(){
        System.out.println("Name\t\t\t: " + name);
        System.out.println("Status\t\t\t: " + status);
        System.out.println("Semester\t\t: " + semester);
    }
}
