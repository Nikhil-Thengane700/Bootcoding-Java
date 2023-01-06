package com.bootcoding.java.oops.Inheritance;

import java.sql.SQLOutput;

public class Table {
    //Parent class- child class
    //Super class - sub class
    //Base Class - Derived class

    // Data member (Properties)
    // Member method (Behaviours)

    int legs;
    boolean tableTop;
    String tableType;
    Material material;

    public void move(){
        System.out.println("Moving Table to another location");
    }

    public void createTable(){
        System.out.println("Create new Table");
    }



}
