package com.bootcoding.java;

/* Question : Calculate the sum of only positive numbers within
 an array using method with return sum*/

public class CalulateOnlyPositveNumOfArray {

    public static int sum(int [] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>=0)
                sum= sum+array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] array ={15, -15 ,5};
        int res = sum(array);

        System.out.println(res);

    }


}

