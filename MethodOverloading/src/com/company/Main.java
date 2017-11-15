package com.company;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Hassaan", 200);
//        System.out.println("New Score is "+newScore);
//        newScore = calculateScore(56);
//        System.out.println("New Score is "+newScore);
        double result = calcFeetAndInchesToCentimeters(6,0);
        System.out.println("Resulting Centimeters: "+result);
        result = calcFeetAndInchesToCentimeters(60);
        System.out.println("Resulting Centimeters for second value: "+result);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+ " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+ " points");
        return score*1000;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >= 0 && inches >=0 && inches <=12){
            return (feet * 12 + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches >=0){
            return inches * 2.54;
        }
        return -1;
    }
}
