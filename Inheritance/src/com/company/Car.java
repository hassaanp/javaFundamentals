package com.company;

public class Car extends Vehicle {
    private int doors;
    private int seatbelts;
    private String name;

    public Car(int chassis, int tyres, int engine, int doors, int seatbelts, String name) {
        super(chassis, tyres, engine);
        this.doors = doors;
        this.seatbelts = seatbelts;
        this.name = name;
    }

    public void stop(){
        System.out.println("Car stopped!");
        move(0);
    }


    @Override
    public void move(int speed){
        System.out.println("Car.move called");
        super.move(speed);
    }

    public int getDoors() {
        return doors;
    }

    public int getSeatbelts() {
        return seatbelts;
    }

    public String getName() {
        return name;
    }
//Car(int chassis, int tyres, int engine)
}
