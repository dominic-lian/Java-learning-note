package com.dominic;

public class Parrot extends Bird implements CanFly {
    public Parrot(String name) {
        super(name);
    }

//    @Override
//    public void fly() {
//        System.out.println("Flitting from branch to branch");
//    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
