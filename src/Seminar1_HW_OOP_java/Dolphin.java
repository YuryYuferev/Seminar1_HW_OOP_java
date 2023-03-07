package Seminar1_HW_OOP_java;

import Seminar1_HW_OOP_java1.Animal;

public class Dolphin extends Animal {
    public Dolphin(String name, String color) {
        super(name, color,0);
    }

    public Dolphin(String name) {
        this(name, null);
    }


    public void speak() {
        System.out.println("Weeeeu!");
    }


    public void toGo() {}


    public void fly() {}
}
