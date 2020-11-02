package com.NabilahSharfina.Modul3.Latihan.No3;

/**
 * by Nabilah Sharfina
 * Menggunakan Komposisi
 */

import java.util.ArrayList;
import java.util.List;

public class Family {
    //Atribut
    public List<Child> childList = new ArrayList<>();
    public String nameFamily;
    public String hometown;
    private Father father;
    private Mother mother;

    //Constructor
    public Family(String nameFamily, String hometown) {
        this.nameFamily = nameFamily;
        this.hometown = hometown;
    }

    /*
    Getter
     */
    public String getNameFamily() {
        return nameFamily;
    }

    public String getHometown() {
        return hometown;
    }

    //Method addFamily untuk menambah data keluarga
    public void addFamily (Father father, Mother mother, List<Child> childList){
        this.father = father;
        this.mother = mother;
        this.childList = childList;
    }

    public List<Child> getChildList() {
        return childList;
    }

    /*
    Getter
     */
    public Father getFather() {
        return father;
    }

    public Mother getMother() {
        return mother;
    }

    //Method getDataFamily
    public void getDataFamily(){
        System.out.println("Family's Name\t: " + getNameFamily());
        System.out.println("Hometown\t\t: " + getHometown());
        System.out.println("Father\t\t\t: " + getFather().getNameFather());
        System.out.println("Mother\t\t\t: " + getMother().getNameMother());
        System.out.println("Child List\t\t: ");
        //Looping output Child List
        for (Child child : childList)
            System.out.println("=> " + child.getNameChild());
    }
}
