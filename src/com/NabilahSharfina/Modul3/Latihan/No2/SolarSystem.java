package com.NabilahSharfina.Modul3.Latihan.No2;

/**
 * by Nabilah Sharfina
 * Menggunakan Agregasi
 */

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    //Atribut
    public String id;
    public String name;
    public List<Planet> PlanetList = new ArrayList<>();

    //Constructor
    public SolarSystem(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Menghitung jumlah planet
    public int getTotalMember(){
        int totalMember = 0;
        for (Planet planet : PlanetList)
            totalMember++;
        return totalMember;
    }

    public List<Planet> getPlanets() {
        return PlanetList;
    }

    public void setPlanets(List<Planet> planets) {
        PlanetList = planets;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Method getData
    public void getData(){
        System.out.println("ID Planet\t: " + getId());
        System.out.println("Planet\t\t: " + getName());
        System.out.println("Planet List\t: ");
        //Looping output jumlah planet
        for(Planet planet : PlanetList)
            System.out.println("<=> " + planet.getNamePlanet());
    }
}
