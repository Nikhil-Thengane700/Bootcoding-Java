package com.bootcoding.java.ClassesAndObjects;

public class Person {
   private String name;
   private int age;
   private long phone;

    public String getName() {
        return name;
    }

    @Override
       public String toString() {
          return "Person{" +
                "name='"  + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
         return age;
    }

    public void setAge(int age) {
         this.age = age;
    }

    public long getPhone() {
         return phone;
    }

    public void setPhone(long phone) {
         this.phone = phone;
    }
}
