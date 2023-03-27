package com.bootcoding.java.CollectionFramework.List;

public class Person {
    private String name;
    private  int age;
    private long phone;

    public Person(String name, int age, long phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
