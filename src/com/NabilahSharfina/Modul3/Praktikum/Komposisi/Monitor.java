package com.NabilahSharfina.Modul3.Praktikum.Komposisi;

public class Monitor {
    private String merk;
    private String size ;
    private String refreshRate;

    public Monitor(String merk, String size, String refreshRate) {
        this.merk = merk;
        this.size = size;
        this.refreshRate = refreshRate;
    }

    public void PrintSpec(){
        System.out.println("- Merk\t\t\t: " + merk);
        System.out.println("- Size\t\t\t: " + size + " inch");
        System.out.println("- Refresh Rate\t: " + refreshRate + " Hz");
        System.out.println();
    }
}
