package com.bootcoding.java.CollectionFramework.Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLaptop {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Dell", 16, 12000));
        list.add(new Laptop("Lenovo", 32, 14000));
        list.add(new Laptop("Lenovo", 8, 14000));
        list.add(new Laptop("Hp", 8, 10000));
        list.add(new Laptop("Asus", 64, 30000));

        Collections.sort(list);
        for(Laptop laptop : list){
            System.out.println(laptop);
        }

    }
}
