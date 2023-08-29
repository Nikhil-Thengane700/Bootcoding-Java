package com.bootcoding.java.CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(12); //use to add elements
        pq.offer(24); //use to add elements
        pq.offer(36);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());




    }
}
