package com.bootcoding.java;
/* Question :  Create a function that takes two strings as arguments
 and return either true or false depending on whether the total number
  of characters in the first string is equal to the total
 number of characters in the second string.*/
public class CompareSizeOfString {
    public static boolean compareSize(String str1, String str2){
        if (str1.length()==str2.length()){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(compareSize("Nikhil", "Manish"));
    }
}
