package com.dominic;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int factor = 1;

        while (factor <= number) {
            if (number % factor == 0) {
                System.out.println(factor);
            }

            factor += 1;
        }
    }
}
