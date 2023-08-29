package com.bootcoding.java.CollectionFramework.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Bunny",4,6541646 ));
        list.add(new Person("Sunny",14,8741646 ));
        list.add(new Person("Jerry",24,65441646 ));
        list.add(new Person("Sarthaki",24,65441646 ));
        System.out.println(list);
    }
}
