package com.bootcoding.java.OOPS;

import com.bootcoding.java.Duster;

public class DusterApplication {
    public static void main(String[] args) {
        Duster d1=Duster.createDuster();
        Duster d2=Duster.createDuster("Red", 25,"Rectangular");

        Duster.printDuster(d1);
        Duster.printDuster(d2);

    }
}
