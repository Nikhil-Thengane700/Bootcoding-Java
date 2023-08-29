package com.bootcoding.java.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Raja");
        list.add("Rani");
        list.add("Jay");
        list.add("Nikhil");
        list.add("Narendra");
        list.add("Amit");

        System.out.println(list);

        //for each loop

     /*   for(String str:list){
            System.out.println(str);
       */

        //Iterator
        Iterator<String> stringIterator= list.listIterator();
        while(stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
            list.remove(4);
        System.out.println(list);


        }
    }

