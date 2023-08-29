package com.bootcoding.java.CollectionFramework.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        // Maps : Hashmap
        //        LinkedListHashmap
        //        TreeMaps

        // Key always unique
        // Values may be duplicate
        HashMap <Integer, String> map = new HashMap<Integer,String>();
        map.put(1,"Nikhil");
        map.put(2,"Achal");
        map.put(3,"Rohit");
        map.put(4,"Monika");

        System.out.println(map);

        // Traversing the map
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }
    }
}
