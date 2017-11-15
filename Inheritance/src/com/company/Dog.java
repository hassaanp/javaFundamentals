package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, String coat){
        super(name, 1, 1,size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;
        this.tail = tail;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("dog chewing");
    }

    public void walk(){
        System.out.println("dog walking");
        move(5);
    }

    public void run(){
        System.out.println("dog running");
        move(10);
    }

    @Override
    public void move(int speed){
        System.out.println("dog is moving");
        super.move(speed);
    }

}
