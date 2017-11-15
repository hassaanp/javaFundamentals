package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("your score was less than 5000");
            System.out.println("this was executed");
        } else if (score == 5000) {
            System.out.println("your score is exactly 5000");
        } else {
            System.out.println("in the else");
        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score is: " + finalScore);
        }

        // this will not work as it is out of scope:
        // System.out.println(finalScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score is: " + finalScore);
        }

    }
}
