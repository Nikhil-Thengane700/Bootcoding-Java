package com.bootcoding.java.FileHandling;

import java.io.FileOutputStream;

public class Example3 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("Sample.text");
            String msg = "I LOVE JAVA";
            byte b[] =msg.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Info wrote successfully");


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
