package com.NabilahSharfina.Modul3.Latihan.No3;

/**
 * by Nabilah Sharfina
 * Menggunakan Komposisi
 */

public class Father {
    //Atribut
    public int idFather;
    public String nameFather;
    public int ageFather;

    //Constructor
    public Father(int idFather, String nameFather, int ageFather) {
        this.idFather = idFather;
        this.nameFather = nameFather;
        this.ageFather = ageFather;
    }

    /*
    Getter
     */
    public int getIdFather() {
        return idFather;
    }

    public String getNameFather() {
        return nameFather;
    }

    public int getAgeFather() {
        return ageFather;
    }
}
