package com.dominic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt = false;

        int yearOfBirth = 0;

        while (!hasNextInt) {

            if (!hasNextInt) {
                System.out.println("Enter your year of birth:");
            }

            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                yearOfBirth = scanner.nextInt();
                scanner.nextLine(); //handle next line character, must call nextline() after a number
            } else {
                scanner.nextLine();
            }
        }

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        int age = 2018 - yearOfBirth;

        System.out.println("Your name is " + name + ", age " + age);

        scanner.close();
    }
}
