package com.dominic;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 1, 1);

        Dog dog = new Dog("Dog", 1, 1, 1, 1, 1, 1, "White");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
