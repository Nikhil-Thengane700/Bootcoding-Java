package com.bootcoding.java.CollectionFramework.Sets;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set <Integer> set = new TreeSet<>();
        // it will store elements in sorted order

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.remove(54);

        System.out.println(set);


    }
}
