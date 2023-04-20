package com.bootcoding.java.RunTimePolymorphism;

class Audi extends Car{

    void run(){System.out.println("“running swiftly with 100km”");}

    public static void main(String args[]){

        Car b = new Audi();//upcasting

        b.run();

    }

}
