package com.dominic;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 10000, levelCompleted, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bounus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bounus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
