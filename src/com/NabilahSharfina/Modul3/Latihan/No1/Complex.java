package com.NabilahSharfina.Modul3.Latihan.No1;

/**
 * by Nabilah Sharfina
 * Menggunakan Asosiasi
 */

import java.util.ArrayList;
import java.util.List;

public class Complex {
    //Atribut
    private String idComplex;
    private String nameComplex;
    private int totalHouse;
    private List<String> idHouseList = new ArrayList<>();

    //Constructor
    public Complex(String idComplex, String nameComplex) {
        this.idComplex = idComplex;
        this.nameComplex = nameComplex;
    }

    //Method add
    public void addHouse(String idHouse){
        idHouseList.add(totalHouse, idHouse);
        totalHouse++;
    }

    /*
    Getter & Setter
     */
    public String getIdComplex() {
        return idComplex;
    }

    public void setIdComplex(String idComplex) {
        this.idComplex = idComplex;
    }

    public String getNameComplex() {
        return nameComplex;
    }

    public void setNameComplex(String nameComplex) {
        this.nameComplex = nameComplex;
    }

    public int getTotalHouse() {
        return totalHouse;
    }

    public void setTotalHouse(int totalHouse) {
        this.totalHouse = totalHouse;
    }

    public void getIdHouse() {
        //Looping for dari idHouse
        for(String index : idHouseList)
            System.out.println("<=> " + index);
    }

    public void setIdHouse(List<String> idHouse) {
        this.idHouseList = idHouse;
    }

    //Method getDataComplez
    public void getDataComplex(){
        System.out.println("ID Complex\t\t: " + idComplex);
        System.out.println("Name Complex\t: " + nameComplex);
        System.out.println("Total House\t\t: " + totalHouse);
        System.out.println("House List\t\t: ");
        getIdHouse();
    }
}