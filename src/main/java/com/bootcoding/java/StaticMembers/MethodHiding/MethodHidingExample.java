package com.bootcoding.java.StaticMembers.MethodHiding;

class Family {
    static void dance() {
        System.out.println("Doing the family dance!");
    }
}

class SpecialMember extends Family {
    static void dance() {
        System.out.println("Doing the special dance!");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Family regularFamilyMember = new Family();
        SpecialMember specialFamilyMember = new SpecialMember();

        regularFamilyMember.dance(); // Calls the static method from the Family class
        specialFamilyMember.dance(); // Calls the static method from the SpecialMember class

        // Using the superclass reference to call the method
        Family referenceToSpecial = new SpecialMember();
        referenceToSpecial.dance(); // Calls the static method from the Family class
    }
}

