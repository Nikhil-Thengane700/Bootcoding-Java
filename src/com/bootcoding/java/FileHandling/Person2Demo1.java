package com.bootcoding.java.FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person2Demo1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("info.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);

            Person2 person2 = new Person2("Babu",23,960473774);
            objOut.writeObject(person2);
            objOut.close();
            fout.close();
            System.out.println("Info stored Successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
