package com.dominic;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean canPack(int bigCout, int smallCount, int goal) {
        if (bigCout < 0 || smallCount < 0) {
            return false;
        }

        int numberOfBig = 0;
        int numberOfSmall = 0;

        while (numberOfBig <= bigCout) {
            numberOfSmall = 0;
            while (numberOfSmall <= smallCount) {
                if (numberOfBig * 5 + numberOfSmall == goal) {
                    return true;
                }

                numberOfSmall += 1;
            }

            numberOfBig += 1;
        }

        return false;
    }

}
