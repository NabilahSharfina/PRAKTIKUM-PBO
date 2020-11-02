package com.NabilahSharfina.Modul3.Latihan.No1;

/**
 * by Nabilah Sharfina
 * Menggunakan Asosiasi
 */

public class House {
    //Atribut
    private String idHouse;
    private String owner;
    private int totalOccupant;

    //Constructor
    public House(String idHouse, String owner, int totalOccupant) {
        this.idHouse = idHouse;
        this.owner = owner;
        this.totalOccupant = totalOccupant;
    }

    /*
    Getter
     */
    public String getIdHouse() {
        return idHouse;
    }

    public String getOwner() {
        return owner;
    }

    public int getTotalOccupant() {
        return totalOccupant;
    }
}
