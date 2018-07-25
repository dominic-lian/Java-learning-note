package com.dominic;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 4000)
            System.out.println("Your score was 5000");

        System.out.println("This was excuted");


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        if (gameOver) {

        } else if (score > 1000) {

        } else {

        }

    }
}
