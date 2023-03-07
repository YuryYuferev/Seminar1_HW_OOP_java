package Seminar1_HW_OOP_java;

import Seminar1_HW_OOP_java1.Animal;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }


    public void speak() {
        System.out.println("Quack!");
    }


}