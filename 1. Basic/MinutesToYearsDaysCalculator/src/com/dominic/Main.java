package com.dominic;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(minutes + " min = " + minutes/525600 + " y and " + minutes%525600/24/60 + " d");
    }
}
