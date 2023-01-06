package com.bootcoding.java;

public class Helmet {
    int price;
    String colour;
    String type;

    public static Helmet createHelmet() {
        Helmet helmet = new Helmet();
        helmet.price = 600;
        helmet.colour = "black";
        helmet.type = "Half Covered";
        return helmet;
    }

    public static Helmet createHelmet(int price, String colour, String type) {
        Helmet helmet = new Helmet();
        helmet.price = price;
        helmet.colour = colour;
        helmet.type = type;
        return helmet;

    }

    public static void printHelmet(Helmet helmet) {
        System.out.println("Price of Helmet: " + helmet.price);
        System.out.println("Colour of Helmet: " + helmet.colour);
        System.out.println("Type of Helmet: " + helmet.type);
    }
}
