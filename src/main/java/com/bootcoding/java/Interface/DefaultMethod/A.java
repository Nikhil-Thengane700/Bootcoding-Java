package com.bootcoding.java.Interface.DefaultMethod;

public interface A {
    void a1(); // public abstract
    void a2();// public + abstract
    default void a3(){
        System.out.println("This is default method of interface A");
    }
}
