package com.NabilahSharfina.Modul3.Latihan.No3;

/**
 * by Nabilah Sharfina
 * Menggunakan Komposisi
 */

import java.util.ArrayList;
import java.util.List;

public class DemoFamily {
    public static void main(String[] args) {
        //Membuat objek baru
        Family fams = new Family("Sinclair", "Indonesia & Malaysia");
        Father father = new Father(1979, "Ashraf", 40);
        Mother mother = new Mother(1983, "BCL", 37);
        Child child = new Child(2010, "Noah", 10, "Student");

        List<Child> childList = new ArrayList<>();//Array list

        //Untuk masukan data dari data child list
        childList.add(child);

        //Untuk copas data dari class DemoFamily ke class-class sebelumnya
        fams.addFamily(father, mother, childList);

        //Menampilkan getDataFamily melalui objek family
        fams.getDataFamily();
    }
}
