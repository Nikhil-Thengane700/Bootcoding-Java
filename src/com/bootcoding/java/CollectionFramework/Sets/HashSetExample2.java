package com.bootcoding.java.CollectionFramework.Sets;

import com.bootcoding.java.CollectionFramework.List.Person;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set <Person> personSet = new HashSet<Person>();
        Person person = new Person("Roshan",22, 26546468);
        //
        Person person1 =person;
        Person person2 =person;
        Person person3 =person;

        personSet.add(new Person("Raj", 22, 25646464));
        personSet.add(new Person("Laxman", 25, 89746464));
        personSet.add(new Person("Sunil", 27, 54746464));
        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println(personSet);


    }
}
