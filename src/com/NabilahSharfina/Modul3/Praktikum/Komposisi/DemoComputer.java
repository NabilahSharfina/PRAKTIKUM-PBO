package com.NabilahSharfina.Modul3.Praktikum.Komposisi;

public class DemoComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("Gaming");
        Keyboard keyboard = new Keyboard("Sades", "Mechanical");
        Mouse mouse = new Mouse("Razer", "800");
        Monitor monitor = new Monitor("Armageddon", "24", "144");
        CPU cpu = new CPU("Intel I3", "Nvidia 3070", "8");

        computer.addComputer(keyboard, mouse, monitor, cpu);

        System.out.println("Type Computer\t: " + computer.getType());
        System.out.println();
        System.out.println("Keyboard\t: ");
        computer.getKeyboard().PrintSpec();
        System.out.println("Mouse\t: ");
        computer.getMouse().PrintSpec();
        System.out.println("Monitor\t\t\t: ");
        computer.getMonitor().PrintSpec();
        System.out.println("CPU\t\t\t: ");
        computer.getCpu().PrintSpec();
    }
}
