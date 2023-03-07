package Seminar1_HW_OOP_java;

import Seminar1_HW_OOP_java1.Animal;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }


    public void speak() {
        System.out.println("Meow!");
    }


    public void swim() {}


    public void fly() {}
}
