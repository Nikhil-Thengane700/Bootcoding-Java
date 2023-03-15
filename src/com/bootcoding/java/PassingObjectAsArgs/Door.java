package com.bootcoding.java.PassingObjectAsArgs;

public class Door {
    double dimensions;
    String unit;
    String type;
    String brand;

    public void print(){
        System.out.println( " Dimension :"+dimensions);
        System.out.println("Unit :" +unit);
        System.out.println("Type :"+type);
        System.out.println("Brand :"+brand);
    }

    public static void main(String[] args) {
        Door d1 = new Door();
        d1.dimensions = 2;
        d1.unit = "Meter";
        d1.brand = "Godrej";
        d1.type = "Steel Door";

        d1.print();
    }
}

