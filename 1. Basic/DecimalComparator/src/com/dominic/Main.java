package com.dominic;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(4.0, 5.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        if (((long)(number1 * 1000)) == ((long)(number2 * 1000))) {
            return true;
        } else {
            return false;
        }
    }
}
