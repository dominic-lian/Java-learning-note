package com.dominic;

public class Main {

    public static void main(String[] args) {
        calculateScore("dominic", 1000);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unamed player scored no points");
        return 1000;
    }
}
