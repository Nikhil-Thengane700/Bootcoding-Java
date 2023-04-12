package com.bootcoding.java.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Raja", 22, 356598154));
        list.add(new Person("Bunty", 23, 896598154));
        list.add(new Person("Bubli", 23, 786598154));
        list.add(new Person("Babu", 23, 63798154));

        System.out.println(list);

        //each method feature of java 8
        list.forEach(person -> System.out.println(person));
    }
}
