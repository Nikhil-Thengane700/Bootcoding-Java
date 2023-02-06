package com.bootcoding.java.oops.Inheritance;

import com.bootcoding.java.oops.Encapsulation.Ambulance;

public class MobileAmbulance extends Ambulance {
    //  parent protected property becomes ->
    public static void main(String[] args) {
        MobileAmbulance ma = new MobileAmbulance();
        // ma.charges // not accesible here

    }

}
