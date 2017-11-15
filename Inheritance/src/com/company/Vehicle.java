package com.company;

public class Vehicle {
    private int chassis;
    private int tyres;
    private int engine;
    private int brake;

    Vehicle(int chassis, int tyres, int engine){
        this.chassis = chassis;
        this.tyres = tyres;
        this.engine = engine;
    }

    public int getBrake() {
        return brake;
    }

    public void move(int speed){
        System.out.println("Vehicle moving at " + speed);
    }

    public int getChassis() {
        return chassis;
    }

    public int getTyres() {
        return tyres;
    }

    public int getEngine() {
        return engine;
    }

    public void setChassis(int chassis) {
        this.chassis = chassis;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }
}
