package com.zoo.species;
import com.zoo.animals.Bird;

public class Eagle extends Bird {
    public Eagle(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Кріі-кріі!");
        super.makeSound();
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
        decreaseEnergy(20);
    }
}
