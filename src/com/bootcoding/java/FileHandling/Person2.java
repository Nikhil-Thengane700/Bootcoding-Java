package com.bootcoding.java.FileHandling;

import java.io.Serializable;

public class Person2 implements Serializable {

    private String name;
    private int age;
    private long phone;

    Person2 (String name , int age, long phone){
        this.name=name;
        this.age=age;
        this.phone=phone;

    }

    public String toString(){
        return "Name:"+name+
                " Age"+ age+
                "Phone "+phone;
    }

}
