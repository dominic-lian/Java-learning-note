package com.dominic;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car audi = new Car();

        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
//        porsche.model = "Carrera";
        System.out.println("Model is " + porsche.getModel());
    }

}
