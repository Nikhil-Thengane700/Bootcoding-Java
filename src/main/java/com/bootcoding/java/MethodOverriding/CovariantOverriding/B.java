package com.bootcoding.java.MethodOverriding.CovariantOverriding;
public class B extends A{
    @Override
    B show(){
        super.show();
        System.out.println("This is Show from B");
        return this;//this--> new B(); or this will return current object
    }}
