package com.bootcoding.java.CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12); // it will add the element to the first
        adq.offerLast(45); // it will add the element at the last
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()"+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() "+adq );

        System.out.println(adq.pollLast());
        System.out.println("pollLast() "+adq);
    }
}
