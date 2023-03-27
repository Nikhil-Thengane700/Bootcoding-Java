package com.bootcoding.java.FileHandling;

public class Person {
    private String name;
    private int age;
    private long phone;

    Person(String name , int age, long phone){
        this.name=name;
        this.age=age;
        this.phone=phone;

    }

    public String toString(){
        return "Name:"+name+
                " Age:"+age+
                " Phone:"+phone;
    }
}
