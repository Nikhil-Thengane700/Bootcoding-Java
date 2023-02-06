package com.bootcoding.java.oops.Assignment.Discount;

import java.util.Random;

public class NameGenrater {

    private  static final String[] CUSTOMER_NAME = {" Ramesh", "Suresh", "Jayesh", "Ganesh", "Mahesh", "Rajesh"};
    private static  final Random random  = new Random();


    public static String getname() {
        int randomIndex = random.nextInt(CUSTOMER_NAME.length);
        return CUSTOMER_NAME[randomIndex];
    }

}
