package com.bootcoding.java;
/* Question :Calculate the sum of only positive numbers within an array using method with return sum */

public class TrueIfOnly10  {
    public static boolean trueOrFalse(int a, int b){
        if (a==10|| b==10 || a+b==10){
            return true;

        }
        else {return false;}}

    public static void main(String[] args) {
        System.out.println(trueOrFalse(5,5));
        System.out.println(trueOrFalse(10,0));
        System.out.println(trueOrFalse(15,5));
    }
}
