package com.bootcoding.java.oops;
public class FinalKeywords {
    public static void main(String[] args) {
        final int a=10;
      //  a=20; // a=30; --- Not allowed
        final double PI = 3.14;
        // PI = 2.14 -- Not allowed

        // final kewword to the rewference
        final Marker blueMarker= new Marker();

        // blueMarker = new Marker(); // Not allowed

        // It is allowed to change the property of object
        blueMarker.color="Blue"; // allowed
        blueMarker.color="red";  // allowed

    }

}
