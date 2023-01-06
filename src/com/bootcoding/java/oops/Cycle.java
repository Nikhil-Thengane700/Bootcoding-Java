package com.bootcoding.java.oops;

public class Cycle {
    int price;
    String colour;
    String SuitableFor;

    public static Cycle createCycle(){
        Cycle cycle = new Cycle();
        cycle.price=10000;
        cycle.colour="Blue";
        cycle.SuitableFor="Boys";
        return cycle;

    }

    public static Cycle createCycle(int price, String colour, String SuitableFor ){
        Cycle cycle = new Cycle();
        cycle.price=price;
        cycle.colour=colour;
        cycle.SuitableFor=SuitableFor;
        return cycle;

    }
    public static void printCycle(Cycle cycle){
        System.out.println("Price of Cycle: "+ cycle.price);
        System.out.println("Colour of Cycle: "+ cycle.colour);
        System.out.println("Cycle Suitable for: "+ cycle.SuitableFor);
    }
}
