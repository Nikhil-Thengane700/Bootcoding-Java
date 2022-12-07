package com.bootcoding.java;

public class CommandLineArguments  {
    public static void main(String[] args) {
        int len= args.length;

        int sum=0;


        for (int i = 0; i < args.length ; i++) {

            System.out.println(args[i].toUpperCase());
//            System.out.println("The length of arguments Provided is " +len);
            int number=Integer.valueOf(args[i]);
            sum=sum+number;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The length of arguments Provided is " +len);

    }}
