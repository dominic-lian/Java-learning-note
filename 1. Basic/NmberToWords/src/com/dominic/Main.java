package com.dominic;

public class Main {

    public static void main(String[] args) {
	    numberToWords(10);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversed = reverse(number);
        int digitCount = getDigitCount(number);

        while (reversed >= 0 && digitCount > 0) {
            int digit = reversed % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversed /= 10;
            digitCount -= 1;
        }

        while (digitCount > 0) {
            System.out.println("Zero");
            digitCount -= 1;
        }
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return  -1;
        }

        if (number == 0) {
            return 1;
        }

        int digit = 0;

        while (number != 0) {
            digit += 1;
            number /= 10;
        }

        return digit;
    }
}
