package com.NabilahSharfina.Modul3.Praktikum.Komposisi;

public class CPU {
    private String processor;
    private String GPU;
    private String RAM;

    public CPU(String processor, String GPU, String RAM) {
        this.processor = processor;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    public void PrintSpec(){
        System.out.println("- Processor\t: " + processor);
        System.out.println("- GPU\t\t: " + GPU);
        System.out.println("- RAM\t\t: " + RAM + " GB");
        System.out.println();
    }
}
