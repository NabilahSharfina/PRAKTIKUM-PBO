package com.NabilahSharfina.Modul2.Latihan.No3;

/**
 * By Nabilah Sharfina
 * Membuat Objek dengan Menggunakan VMI
 */

public class DemoStatus {
    public static void main(String[] args) {
        System.out.println("==========VMI OF STUDENT COLLEGE===========");
        Student $student = new Student();//Membuat Objek Student
        Sweetheart $sweetheart = new Student();//Membuat Objek Sweetheart
        Sweetheart $date = new Sweetheart();//Membuat Objek Date

        //OUTPUT
        $student.getStatus();//Memanggil method getStatus beserta output dari objek student
        System.out.println();
        $sweetheart.getStatus();//Memanggil method getStatus beserta output dari objek sweetheart
        $date.getStatus();//Memanggil method getStatus beserta output dari objek date

        System.out.println("\t\t\t\t\t>>>WARNING!<<<");
        System.out.println("For those of you who haven't partner list, Take It Calm");
        System.out.println("We were created to be in pairs, yeah!");
    }
}
