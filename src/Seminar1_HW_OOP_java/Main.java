package Seminar1_HW_OOP_java;

import Seminar1_HW_OOP_java1.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals;
        animals = new ArrayList<>();
        animals.add(new Cat("Leopold"));
        animals.add(new Dog("Bobby"));
        animals.add(new Eagle("Harry"));
        animals.add(new Duck("Donald"));
        animals.add(new Dolphin("Flipper"));
        animals.add(new Whale("Mobi Dick"));


        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }

}