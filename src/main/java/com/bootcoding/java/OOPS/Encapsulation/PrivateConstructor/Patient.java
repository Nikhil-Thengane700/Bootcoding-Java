package com.bootcoding.java.OOPS.Encapsulation.PrivateConstructor;

import java.util.Date;

public class Patient {
    public String name;
   private String disease;
    public int age;
     Date admitDate;
    Date dischargeDate;

 private    Patient(){

        System.out.println("Private Constructor");}
    public static Patient get(){
        return new Patient();
    }




}
