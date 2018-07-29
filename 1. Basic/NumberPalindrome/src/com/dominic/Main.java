package com.dominic;

public class Main {

    public static void main(String[] args) {
	    isPalindrome(-1221);
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int num = number;

        do {
            reversed += num % 10;
            num = num / 10;
            reversed *= 10;
        } while (num / 10 != 0);

        reversed += num;

        if (reversed == number) {
            return true;
        } else {
            return false;
        }
    }
}
