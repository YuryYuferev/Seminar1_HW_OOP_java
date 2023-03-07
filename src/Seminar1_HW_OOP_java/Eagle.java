package Seminar1_HW_OOP_java;

import Seminar1_HW_OOP_java1.Animal;

public class Eagle extends Animal {
    public Eagle(String name, String color) {
        super(name, color,2);
    }

    public Eagle(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Screech!");
    }

    @Override
    public void toGo() {}

    @Override
    public void swim() {}
}