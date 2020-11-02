package com.NabilahSharfina.Modul3.Latihan.No3;

/**
 * by Nabilah Sharfina
 * Menggunakan Komposisi
 */

public class Child {
    //Atribut
    public int idChild;
    public String nameChild;
    public int ageChild;
    public String statusChild;

    //Constructor
    public Child(int idChild, String nameChild, int ageChild, String statusChild) {
        this.idChild = idChild;
        this.nameChild = nameChild;
        this.ageChild = ageChild;
        this.statusChild = statusChild;
    }

    /*
    Getter
     */
    public int getIdChild() {
        return idChild;
    }

    public String getNameChild() {
        return nameChild;
    }

    public int getAgeChild() {
        return ageChild;
    }

    public String getStatusChild() {
        return statusChild;
    }
}
