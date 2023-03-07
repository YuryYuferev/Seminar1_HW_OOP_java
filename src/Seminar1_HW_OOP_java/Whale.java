package Seminar1_HW_OOP_java;

import Seminar1_HW_OOP_java1.Animal;

public class Whale extends Animal {
    public Whale(String name, String color) {
        super(name, color, 0);
    }

    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wooo!");
    }

    @Override
    public void toGo() {}

    @Override
    public void fly() {}
}