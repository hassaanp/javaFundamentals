package com.company;

public class Room {
    private Door door;
    private Bed bed;
    private Light tubeLight;
    private Light bulb;

    Room(Door door, Bed bed, Light tubeLight, Light bulb){
        this.door = door;
        this.bed = bed;
        this.tubeLight = tubeLight;
        this.bulb = bulb;
    }

    public void tidyUp(String bedSheetColor){
        door.openDoor();
        tubeLight.turnOn();
        bulb.turnOn();
        bed.changeSheet(bedSheetColor);
        bed.makeBed();
        bulb.turnOff();
        tubeLight.turnOff();
        door.closeDoor();
    }


}
