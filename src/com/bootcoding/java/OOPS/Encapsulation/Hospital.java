package com.bootcoding.java.OOPS.Encapsulation;

import java.util.Date;

public class Hospital {
    public static void main(String[] args) {
        Patient p = Patient.get();

        p.name="ramesh";
        p.age=23;
        p.admitDate=new Date();
        System.out.println(p.name);


    }
}
