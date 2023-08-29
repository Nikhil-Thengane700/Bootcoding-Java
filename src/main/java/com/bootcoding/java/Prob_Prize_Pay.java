package com.bootcoding.java;
/* Question :Create a function that takes three arguments prob, prize, pay and returns true  if prob * prize > pay; otherwise return false.

For Ex 1:

input, prob = 0.2, prize=50, pay = 9

output: true

* */
public class Prob_Prize_Pay{
    public static boolean returnTrueOrFalse(double prob, double prize, double pay)
    {
        if(prob*prize>pay){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(returnTrueOrFalse(0.2,50, 9));
    }
}
