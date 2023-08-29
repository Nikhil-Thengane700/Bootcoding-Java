package com.bootcoding.java.OOPS.Assignment.Discount;

import java.util.Random;

public class OrderCountGenrater {
    private final static int MAX=100;
    private final static int MIN=1;
    private final static Random raandom = new Random();
    public static int getOrderCount(){
        return MIN + raandom.nextInt(MAX-MIN);
    }


}
