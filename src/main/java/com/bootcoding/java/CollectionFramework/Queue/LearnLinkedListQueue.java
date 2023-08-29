package com.bootcoding.java.CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12); //use to add elements
        queue.offer(24); //use to add elements
        queue.offer(36); //use to add elements

        System.out.println(queue);

        System.out.println(queue.poll()); // delete and return what's deleted

        System.out.println(queue);

        System.out.println(queue.peek()); // which next element is gonna delete




    }
}
