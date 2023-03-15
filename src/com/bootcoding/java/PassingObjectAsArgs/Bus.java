package com.bootcoding.java.PassingObjectAsArgs;

public class Bus {
    double length;
    String brand;
    String NoOfSeats;
    int price;
    public void print (){
        System.out.println("Dimension: "+ length);
        System.out.println("Brand: "+ brand);
        System.out.println("No of Seats: " +NoOfSeats);
        System.out.println("Price: "+ price);

    }

    public static void main(String[] args) {
        Bus b1= new Bus();
        b1.length= 48;
    }
}
