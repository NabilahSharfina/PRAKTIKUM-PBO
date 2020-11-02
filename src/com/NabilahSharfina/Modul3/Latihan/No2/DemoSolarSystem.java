package com.NabilahSharfina.Modul3.Latihan.No2;

/**
 * by Nabilah Sharfina
 * Menggunakan Agregasi
 */

import java.util.ArrayList;
import java.util.List;

public class DemoSolarSystem {
    public static void main(String[] args) {
        //Membuat objek system
        SolarSystem system = new SolarSystem("131", "Aurora");

        /*
        Membuat objek planet
         */
        Planet planet1 = new Planet(111, 1, "Merkurius");
        Planet planet2 = new Planet(122, 3, "Bumi");
        Planet planet3 = new Planet(133, 2, "Venus");
        Planet planet4 = new Planet(144, 4, "Mars");
        Planet planet5 = new Planet(155, 8, "Neptunus");
        Planet planet6 = new Planet(166, 6, "Saturnus");
        Planet planet7 = new Planet(177, 5, "Jupiter");
        Planet planet8 = new Planet(188, 7, "Uranus");

        List<Planet> PlanetList = new ArrayList<>();//ArrayList

        //Untuk masukan data dari data Planet
        PlanetList.add(planet1);
        PlanetList.add(planet2);
        PlanetList.add(planet3);
        PlanetList.add(planet4);
        PlanetList.add(planet5);
        PlanetList.add(planet6);
        PlanetList.add(planet7);
        PlanetList.add(planet8);

        //Untuk copas data dari list planet
        system.setPlanets(PlanetList);

        //Memanggil getData dengan objek system
        system.getData();
    }
}
