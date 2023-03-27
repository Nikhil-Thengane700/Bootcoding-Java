package com.bootcoding.java.FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Person2Demo2 {
    public static void main(String[] args) {
        try{
       // final long serialVersionUID = 7635210045424937926L;
            FileInputStream fin = new FileInputStream("info.txt");
            ObjectInputStream objIn =new ObjectInputStream(fin);
            Person2 person = (Person2) objIn.readObject();
            System.out.println(person);
            objIn.close();
            fin.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
