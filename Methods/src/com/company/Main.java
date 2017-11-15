package com.company;

public class Main {

    public static void main(String[] args) {
        int finalScore = calculateScore(true,10000,200,8);
        int finalScore2 = calculateScore(true,800,100,5);

        System.out.println("your final score is: " + finalScore);
        System.out.println("your final score is: " + finalScore2);
    }

    public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted){
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }

        return -1;
    }
}
