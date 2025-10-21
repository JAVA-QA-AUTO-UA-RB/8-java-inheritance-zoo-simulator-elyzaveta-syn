package com.zoo.species;
import com.zoo.animals.Mammal;

public class Elephant extends Mammal {
    public Elephant(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Труба-ба-ба!");
        super.makeSound();
    }

    public void spraySelf() {
        System.out.println(name + " поливає себе водою.");
    }
}
