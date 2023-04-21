package com.bootcoding.oops.encapsulation.hospital;

import java.util.Date;

public class Patient {

    private String disease;
    public String name;
    public Date dateOfAdmission;
    public Date dischargeDate;

    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Date of Admission: "+ dateOfAdmission);
        System.out.println("Date of Discharge: "+ dischargeDate);
        System.out.println("Disease: "+ disease);
    }
}
