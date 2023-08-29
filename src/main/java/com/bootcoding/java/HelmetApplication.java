package com.bootcoding.java;

public class HelmetApplication {
    public static void main(String[] args) {


        Helmet h1 = Helmet.createHelmet();
        Helmet h2 = Helmet.createHelmet(900, "Grey", "Full Covered");

        Helmet.printHelmet(h1);
        Helmet.printHelmet(h2);
    }
}
