package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // + - * /
        int val = 24;
        val-= 2;
        System.out.println(--val);

        boolean isAlien = false;

        if(!isAlien){
            System.out.println("it is not an alien");
        }

        int topScore = 99;
        int secondTopScore = 9;

        if (topScore>=100 || secondTopScore < 100)
            System.out.println("satisfied");
        else
            System.out.println("not satisfied");

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("Yes, it is a car");
    }
}
