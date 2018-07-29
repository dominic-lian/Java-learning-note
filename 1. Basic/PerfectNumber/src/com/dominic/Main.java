package com.dominic;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int factor = 1;
        int sum = 0;

        while (factor < number) {
            if (number % factor == 0) {
                sum += factor;
            }

            factor += 1;
        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }
}
