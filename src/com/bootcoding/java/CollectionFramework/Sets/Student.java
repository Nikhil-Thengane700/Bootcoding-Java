package com.bootcoding.java.CollectionFramework.Sets;

public class Student implements Comparable<Student> {
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    String name;
    int rollNo;


    @Override
    public int compareTo(Student that) {
        return this.rollNo- that.rollNo;
    }
}
