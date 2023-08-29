package com.bootcoding.java;
/*Question : Create a function that takes the age in years and returns the age in days.
*  */
public class YearsToDays {
    public static int YearToDays(int age){
        return age*365;
    }

    public static void main(String[] args) {
        System.out.println(YearToDays(21)+ "Days");
    }
}
