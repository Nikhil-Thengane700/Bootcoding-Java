package com.bootcoding.java.OOPS.Encapsulation;

import java.util.Date;

public class Patient {
    public String name;
   private String disease;
    public int age;
    public Date admitDate;
    public Date dischargeDate;

    private Patient(){

    }
    public static Patient get(){
        return new Patient();
    }




}
