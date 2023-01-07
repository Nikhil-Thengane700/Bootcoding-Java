package com.bootcoding.java.oops.Encapsulation;

public class AmbulanceApplication {
    public static void main(String[] args) {


    Ambulance amb = new Ambulance();
    amb.setHospitalName("AIIMS");
    amb.setType("Bus");
    amb.setCharges(1000);
    amb.setAvailable(true);

        System.out.println("Ambulance Info: ");
        System.out.println("Hospital Name: "+ amb.getHospitalName());
        System.out.println("Type of ambulance: "+ amb.getType());
        System.out.println("Charges: "+ amb.getCharges());
        System.out.println("Is available: "+ amb.isAvailable());


}}
