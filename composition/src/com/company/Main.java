package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,40,60);
        Case theCase = new Case("2B1A","HP","240V",dimensions);
        Monitor monitor = new Monitor("Heavy Bro","LG", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("qq32", "Asus",5,3,"1.1.2");
        PC myPC = new PC(theCase, monitor, motherboard);
        myPC.powerUp();

        Door door = new Door("brown",300,150);
        Light tubeLight = new Light("tube","white");
        Light bulb = new Light("bulb","yellow");
        Bed bed = new Bed("queen",20,10,40);
        Room bedRoom = new Room(door,bed, tubeLight,bulb);
        bedRoom.tidyUp("red");
    }
}
