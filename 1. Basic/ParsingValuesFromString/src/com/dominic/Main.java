package com.dominic;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "14123";
//	    String numberAsString = "14123.12";
//      String numberAsString = "2018a";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        double doubleNumber = Double.parseDouble(numberAsString);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("int = " + number);
        System.out.println("double = " + doubleNumber);
    }
}
