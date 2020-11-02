package com.NabilahSharfina.Modul3.Praktikum.Komposisi;

public class Computer {
    private String type;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private CPU cpu;

    public Computer(String type) {
        this.type = type;
    }

    public void addComputer(Keyboard keyboard, Mouse mouse, Monitor monitor, CPU cpu){
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.cpu = cpu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
