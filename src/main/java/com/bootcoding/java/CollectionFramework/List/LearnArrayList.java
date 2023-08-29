package com.bootcoding.java.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

//        ArrayList<String> studentsName = new ArrayList<>(); //it will create empty array  size n then n+n/2  +1
//        studentsName.add("Rakesh");
//        studentsName.add("Ritik");
//        System.out.println(studentsName);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        List <Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list); // This will add all the elements in the one list

        list.remove(Integer.valueOf(30));//This will remove the specific element if available
        System.out.println(list);

        list.clear(); // it will clear the entire list
        System.out.println(list);


    }
}
