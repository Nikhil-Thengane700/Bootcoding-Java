package com.bootcoding.java.OOPS.Inheritance;

import com.bootcoding.java.OOPS.Encapsulation.Ambulance;

public class MobileAmbulance extends Ambulance {
    //  parent protected property becomes ->
    public static void main(String[] args) {
        MobileAmbulance ma = new MobileAmbulance();
        // ma.charges // not accesible here

    }

}
