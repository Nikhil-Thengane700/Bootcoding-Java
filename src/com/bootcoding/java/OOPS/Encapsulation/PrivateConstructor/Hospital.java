package com.bootcoding.java.OOPS.Encapsulation.PrivateConstructor;

import java.util.Date;
import java.util.UUID;

public class Hospital {
    public String name;
    private UUID id;
    String address;
    String services;
    public static void main(String[] args) {
        Patient p = Patient.get();
     

        p.name="ramesh";
        p.age=23;
        p.admitDate=new Date();
        System.out.println(p.name);


    }
}
