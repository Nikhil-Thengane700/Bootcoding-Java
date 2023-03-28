package com.bootcoding.java.StaticMembers;

public class Sample {
    static int a;
    int b;

    public static void main(String[] args) {
        a=0;
        Sample s1 = new Sample();

        // We have to make object for non-static member to access in static method
        s1.b=1;


    }
}
