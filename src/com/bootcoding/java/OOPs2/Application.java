package com.bootcoding.java.OOPs2;

public class Application {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Projector projector = new Projector();

        Projector proj2 = new Projector();
        Projector[]  ps = new Projector[5];
        faculty.startProjector(projector.name);


        faculty.stopProjector (proj2);

        for (int i = 0; i <ps.length ; i++) {
            Projector p = new Projector();
            p.name= "Projector"+ i;
            ps[i]=p;




    }
}}
