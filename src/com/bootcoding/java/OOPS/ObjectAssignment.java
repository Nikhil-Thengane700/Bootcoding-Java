package com.bootcoding.java.OOPS;

public class ObjectAssignment {
    public static void main(String[] args) {

        // Primitive data types
        int a=10;
        int b=a;
        b=30;  // b - change but not changing

        System.out.println(" Value of b ="+ b);
        System.out.println(" Value of a ="+ a);

        // ADT - Abstract data types

        Marker blueMarker= new Marker();
        Marker redMarker= blueMarker;
        blueMarker.color="Blue";
        redMarker.color="Red";
        System.out.println("Valuer of Bluemarker =" + blueMarker.color);
        System.out.println("Valuer of Redmarker =" + redMarker.color);




    }
}
