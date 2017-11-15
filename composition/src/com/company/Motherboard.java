package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName+" running.");
    }

    public String getModel(){
        return this.model;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public int getRamSlots(){
        return this.ramSlots;
    }

    public int getCardSlots(){
        return this.cardSlots;
    }

    public String getBios(){
        return this.bios;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
