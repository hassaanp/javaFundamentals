package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public String getModel(){
        return this.model;
    }

    public String[] getAll(){
        String[] result = {this.model,Integer.toString(this.doors)};
        return result;
    }
}
