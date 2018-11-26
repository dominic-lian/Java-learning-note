package com.dominic;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Dominic");

//        ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //deprecated
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.5);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }


        //AutoBoxing
        Integer myIntValue_1 = 54;
        //means
        Integer myIntValue_2 = Integer.valueOf(54);

        int myInt_1 = myIntValue_1;
        //means
        int myInt_2 = myIntValue_1.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double i = 0.0; i < 10.0; i+=0.5) {
            myDoubleValues.add(i);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}

