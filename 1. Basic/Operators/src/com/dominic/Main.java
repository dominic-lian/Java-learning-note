package com.dominic;

public class Main {

    public static void main(String[] args) {


        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);


        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result += 5;
        System.out.println("Result is now " + result);

        result -= 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result /= 5;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the top score");

        topScore = 100;
        if (topScore >= 80)
            System.out.println("You got a score more than 80");

        topScore = 70;
        if (topScore <= 80)
            System.out.println("You got a score less than 80");

        if (!isAlien && (topScore <= 80))
            System.out.println("Not an alien and got a score less than 80");

        if (isAlien || (topScore <= 80))
            System.out.println("Not an alien or got a score less than 80");

        boolean isCar = false;
        if (isCar = true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

    }
}
