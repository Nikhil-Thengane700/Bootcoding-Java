package com.bootcoding.java;

public class Duster {
    String colour;
    int price;
    String shape;


    public static  Duster createDuster(){
        Duster duster= new Duster();
        duster.colour="Black";
        duster.price=20;
        duster.shape="Rectangular";
        return duster;
    }

    public static Duster createDuster(String colour, int price, String shape){
        Duster duster = new Duster();
        duster.colour=colour;
        duster.price=price;
        duster.shape=shape;
        return duster;
    }

    public static void printDuster(Duster duster){
        System.out.println("Colour of Duster: "+ duster.colour);
        System.out.println("Colour of Price: "+ duster.price);
        System.out.println("Colour of Shape: "+ duster.shape);
    }
}
