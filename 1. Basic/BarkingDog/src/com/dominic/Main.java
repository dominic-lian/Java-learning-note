package com.dominic;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            if (barking) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
