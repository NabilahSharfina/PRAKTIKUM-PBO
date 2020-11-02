package com.NabilahSharfina.Modul3.Latihan.No3;

/**
 * by Nabilah Sharfina
 * Menggunakan Komposisi
 */

public class Mother {
    //Atribut
    public int idMother;
    public String nameMother;
    public int ageMother;

    //Constructor
    public Mother(int idMother, String nameMother, int ageMother) {
        this.idMother = idMother;
        this.nameMother = nameMother;
        this.ageMother = ageMother;
    }

    /*
    Getter
     */
    public int getIdMother() {
        return idMother;
    }

    public String getNameMother() {
        return nameMother;
    }

    public int getAgeMother() {
        return ageMother;
    }
}
