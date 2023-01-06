package com.bootcoding.java;

public class MethodApi {
    public static boolean isSeniorCitizen(int [] ages){
        for (int i = 0; i < ages.length; i++) {
           if(ages[i]>=60) {
               return true;
           }
        }

        return false;
    }

    public static boolean isKid(int [] ages){
        for (int i = 0; i < ages.length; i++) {
            if(ages[i]>=1 && ages[i]<=10) {
                return true;
            }
        }

        return false;
    }

    public static boolean isAdult(int [] ages){
        for (int i = 0; i < ages.length; i++) {
            if(ages[i]>=18 && ages[i]<=60) {
                return true;
            }
        }

        return false;
    }



    public static void main(String[] args) {


        int[] ages = {12, 25, 26, 27, 30,60};
        boolean result =isSeniorCitizen(ages);
        System.out.println(result);

        boolean result2 = isKid(ages);
        System.out.println(result2);

        boolean result3= isAdult(ages);
        System.out.println(result3 );

    }
}
