package com.company;

public class Door {
    private String color;
    private double length;
    private double width;

    Door(String color, double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void openDoor(){
        System.out.println("door is now open");
    }

    public void closeDoor(){
        System.out.println("door is now closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
