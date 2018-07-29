package com.dominic;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        if (number < 3) {
            return number;
        }

        int prime = number;

        while (prime > 0) {

            boolean isPrime = true;

            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime && number % prime == 0) {
                return prime;
            }

            prime -= 1;
        }

        return 1;
    }
}
