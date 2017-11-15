package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.health = 20;
//	    player.name = "Hassaan";
//	    player.weapon = "gun";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
//	    damage = 11;
//	    player.loseHealth(damage);
        Printer duplexPrinter = new Printer(90,0,"duplex");
        Printer normalPrinter = new Printer(100, 0, "normal");

        duplexPrinter.print(11);
        System.out.println("Pages Printed: "+duplexPrinter.getPagesPrinted());

        normalPrinter.print(10);
        System.out.println("Pages Printed: "+normalPrinter.getPagesPrinted());
    }
}
