package com.bootcoding.java.CollectionFramework.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class LinkedHashmapExample {
    public static void main(String[] args) {
        Map<Integer, String>  map = new LinkedHashMap<>();
        map.put(1,"Bunny");
        map.put(2,"Sunnny");
        map.put(3,"Jenny");
        map.put(4,"Bubli");


        //Traversing linked Hashmap

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }


    }
}
