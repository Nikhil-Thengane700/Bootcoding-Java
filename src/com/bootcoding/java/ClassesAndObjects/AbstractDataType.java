package com.bootcoding.java.ClassesAndObjects;

public class AbstractDataType {

      public static void main(String[] args) {

             Marker redMarker = new Marker();
             Marker blueMarker =redMarker;

          redMarker.color="Red";
          blueMarker.color="Blue";
          System.out.println(redMarker.color);
          System.out.println(blueMarker.color);

    }
}
