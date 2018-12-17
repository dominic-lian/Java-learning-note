package com.dominic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("ringnect");
        parrot.breathe();
        parrot.eat();
        parrot.fly();


        Penguin penguin = new Penguin("jojo");
        penguin.breathe();
        penguin.eat();
        penguin.fly();



    }

}
