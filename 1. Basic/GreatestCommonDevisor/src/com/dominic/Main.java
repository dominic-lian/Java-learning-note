package com.dominic;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int devisor = first > second ? second : first;

        while (devisor > 0) {
            if (first % devisor == 0 && second % devisor == 0) {
                return devisor;
            }

            devisor -= 1;
        }

        return 1;
    }
}
