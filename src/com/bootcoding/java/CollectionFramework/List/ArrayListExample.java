package com.bootcoding.java.CollectionFramework.List;
import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Raja");
        list.add("Banti");
        list.add("Babli");
        list.add("Babu");
        list.add("Jai");
        list.add("Raju");

        //Traditional loop

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        // for each loop
     /*   for(String str : list){
            System.out.println(str);
        }

      */

        //For each method in java 8

        list.forEach(str-> System.out.println(str));
    }
}
