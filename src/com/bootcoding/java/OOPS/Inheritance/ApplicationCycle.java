package com.bootcoding.java.OOPS.Inheritance;

public class ApplicationCycle {
    public static void main(String[] args) {
        GearCycle gc= new GearCycle();
        gc.price = 8000;
        gc.colour = "Black";
        gc.model = "AX100";
        gc.createCycle();
        gc.move();

        NonGear ng= new NonGear();
        ng.price = 8000;
        ng.colour = "Black";
        ng.model = "AX100";
        ng.createCycle();
        ng.move();
    }
}
