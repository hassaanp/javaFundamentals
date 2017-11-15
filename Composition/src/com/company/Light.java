package com.company;

public class Light {
    private String type;
    private String color;

    public Light(String type, String color) {

        this.type = type;
        this.color = color;
    }

    public void turnOn(){
        System.out.println("Light has been switched on");
    }

    public void turnOff(){
        System.out.println("Light has been switched off");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
