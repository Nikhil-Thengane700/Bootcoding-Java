package com.bootcoding.java.Interface.Example2;

public class Demo {
    public static void main(String[] args) {
        Idea idea = new Idea();
        Airtel airtel = new Airtel();
        Jio jio = new Jio();

        Magic magic = new Magic();
        magic.showMagic(idea);
        magic.showMagic(airtel);
        magic.showMagic(jio);
    }
}
