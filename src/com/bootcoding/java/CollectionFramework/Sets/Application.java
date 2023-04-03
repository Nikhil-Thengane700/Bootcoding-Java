package com.bootcoding.java.CollectionFramework.Sets;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Student> studentSet = new ArrayList<>();
        studentSet.add(new Student("Anuj" , 2));
        studentSet.add(new Student("Ramesh" , 4));
        studentSet.add(new Student("Shivam" , 3));
        studentSet.add(new Student("Rohit" , 2));


        System.out.println(studentSet);

        Collections.sort(studentSet) ;

        System.out.println(studentSet);
    }
}
