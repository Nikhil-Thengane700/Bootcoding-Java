package com.bootcoding.java.FileHandling;
import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try{
            File file = new File("F:\\MySample.txt");
            if(file.createNewFile()){
                System.out.println("File "+ file.getName()+ " created Successfully");
            }
            else{
                System.out.println("File already exist");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
