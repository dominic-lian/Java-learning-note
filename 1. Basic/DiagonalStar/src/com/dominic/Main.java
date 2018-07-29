package com.dominic;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int rowNumber = 1;
        int columnNumber = 1;

        for (rowNumber = 1; rowNumber <= number; rowNumber++) {
            for (columnNumber = 1; columnNumber <= number; columnNumber++) {
                if (rowNumber == 1 ||
                        rowNumber == number ||
                        columnNumber == 1 ||
                        columnNumber == number ||
                        rowNumber == columnNumber ||
                        columnNumber == number - rowNumber + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                if (columnNumber == number) {
                    System.out.println("");
                }
            }
        }

    }
}
