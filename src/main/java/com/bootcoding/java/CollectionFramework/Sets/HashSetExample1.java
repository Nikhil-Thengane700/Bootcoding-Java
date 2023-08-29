package com.bootcoding.java.CollectionFramework.Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set <String> stringSet= new HashSet<String>();
        stringSet.add("Rajat");
        stringSet.add("Ankita");
        stringSet.add("Ravi");
        stringSet.add("Raghu");
        stringSet.add("Ram");
        stringSet.add("Rajan");
        System.out.println(stringSet);

    }
}
