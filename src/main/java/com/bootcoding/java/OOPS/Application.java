package com.bootcoding.java.OOPS;

public class Application
{
    public static void main(String[] args) {
        Car car=new Car();
        car.startEngine();
        car.move();


        car.carOwner = "Nikhil Thengane";
        car.brandName="Tata";
        car.model= "Harrier";
        car.engine= "TDI";
        car.fuelType="Petrol";
        car.colour="Black";
        car.lights=4;
        car.seats=5;
        car.print();



    }


}
