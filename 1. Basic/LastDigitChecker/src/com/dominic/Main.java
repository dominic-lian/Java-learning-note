package com.dominic;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 > 1000 || num1 < 10 || num2 > 1000 || num2 < 10 || num3 > 1000 || num3 < 10) {
            return false;
        }

        if (num1 % 10 == num2 % 10 ||
                num1 % 10 == num3 % 10 ||
                num2 % 10 == num3 % 10) {
            return true;
        }
        return false;
    }

//    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
//        if (num1 > 1000 || num1 < 10 || num2 > 1000 || num2 < 10 || num3 > 1000 || num3 < 10) {
//            return false;
//        }
//
//        int num_1 = num1;
//        while (num_1 > 0) {
//            int digit_1 = num_1 % 10;
//            int num_2 = num2;
//            while (num_2 > 0) {
//                int digit_2 = num_2 % 10;
//                int num_3 = num3;
//                while (num_3 > 0) {
//                    int digit_3 = num_3 % 10;
//
//                    if (digit_1 == digit_2 || digit_2 == digit_3 || digit_1 == digit_3) {
//                        return true;
//                    }
//
//                    num_3 = num_3 / 10;
//                }
//
//                num_2 = num_2 / 10;
//            }
//
//            num_1 = num_1 / 10;
//        }
//
//        return false;
//    }
    }
