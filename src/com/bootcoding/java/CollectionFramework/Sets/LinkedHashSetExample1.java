package com.bootcoding.java.CollectionFramework.Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<String>();
        stringSet.add("Raja");
        stringSet.add("Bhim");
        stringSet.add("Raja");
        stringSet.add("Laxman");

        stringSet.forEach(s -> System.out.println(s));

    }
}
