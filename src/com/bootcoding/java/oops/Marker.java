package com.bootcoding.java.oops;

public class Marker {
    String type;
    String color;
    String brand;
    double price;
    public void refill(){
        System.out.println("Refill marker sucessfully");
  }
  public void write(String message){
      System.out.println("on white board - "+ message);
  }

    public void print() {
        System.out.println("Marker  Color = "+ color);
        System.out.println("Marker  Brand = "+ brand);
        System.out.println("Marker  Type = "+ type);
        System.out.println("Marker  Price = "+ price);


    }
}
