package com.dominic;

public class Main {

    public static void main(String[] args) {
	    int num = sumFirstAndLastDigit(-15);
        System.out.println(num);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return number * 2;
        }

        int sum = 0;
        sum += Math.abs(number) % 10;

        while (number > 0) {
            number /= 10;
            if (number < 10) {
                sum += number;
                break;
            }
        }

        return  sum;
    }
}
