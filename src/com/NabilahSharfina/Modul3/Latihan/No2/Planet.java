package com.NabilahSharfina.Modul3.Latihan.No2;

/**
 * by Nabilah Sharfina
 * Menggunakan Agregasi
 */

public class Planet {
    //Atribut
    public int idPlanet;
    public int sequence;
    public String namePlanet;

    //Constructor
    public Planet(int idPlanet, int sequence, String namePlanet) {
        this.idPlanet = idPlanet;
        this.sequence = sequence;
        this.namePlanet = namePlanet;
    }

    public int getIdPlanet() {
        return idPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }
}
