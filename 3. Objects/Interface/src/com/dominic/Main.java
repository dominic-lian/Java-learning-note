package com.dominic;

public class Main {

    public static void main(String[] args) {
	    ITelephone dominicsPhone;
	    dominicsPhone = new DeskPhone(123556);
	    dominicsPhone.powerOn();
	    dominicsPhone.callPhone(123556);
	    dominicsPhone.answer();


        dominicsPhone = new MobilePhone(54321);
        dominicsPhone.powerOn();
        dominicsPhone.callPhone(54321);
        dominicsPhone.answer();
    }
}
