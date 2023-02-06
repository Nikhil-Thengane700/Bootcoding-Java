package com.bootcoding.java.oops.Assignment.Discount;

import java.util.Random;

public class VisitCountGenareter {
    private final static int MAX=100;
    private final static int MIN=1;
    private final static Random raandom = new Random();



    public static int getVisitCount(){
        return MIN + raandom.nextInt(MAX-MIN);
    }
}
