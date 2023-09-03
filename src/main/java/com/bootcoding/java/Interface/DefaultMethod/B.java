package com.bootcoding.java.Interface.DefaultMethod;

public class B implements A{
    @Override
    public void a1() {
        System.out.println("Class B a1() ");
    }

    @Override
    public void a2() {
        System.out.println("Class B a2() ");

    }

    public void a3(){
        System.out.println("Overriding in implementing in class B");
    }
}
