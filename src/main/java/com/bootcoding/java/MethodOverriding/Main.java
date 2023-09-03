package com.bootcoding.java.MethodOverriding;

class Parent {
    private void privateMethod() {
        System.out.println("Parent's private method");
    }

    class InnerClass {
        // This method can "override" the privateMethod() from the Parent class

        private void privateMethod() {
            System.out.println("InnerClass's private method");
        }

        public void callPrivateMethod() {
            System.out.println("Calling private method from InnerClass");
            privateMethod(); // Calls the private method of InnerClass
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        // Create an instance of the inner class
        Parent.InnerClass innerClass = parent.new InnerClass();
        innerClass.callPrivateMethod(); // Calls InnerClass's private method
    }
}
