package com.company;

public class Bed {
    private String type;
    private double height;
    private double width;
    private double length;

    public Bed(String type, double height, double width, double length) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void changeSheet(String color){
        System.out.println("The bedsheet has been changed and the color of the new sheet is: "+color);
    }

    public void makeBed(){
        System.out.println("Bed has been made");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
