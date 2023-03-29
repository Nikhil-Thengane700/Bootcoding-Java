package com.bootcoding.java.OOPS.Inheritance.Example2;

public class C extends B{
    C (){
        System.out.println("Default Constructor of C");
    }
    C(int n){
        super(200);
        System.out.println("Parameterized Constructor of C");
    }
}
