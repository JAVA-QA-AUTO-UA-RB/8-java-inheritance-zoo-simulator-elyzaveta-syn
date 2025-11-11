package com.zoo.species;
import com.zoo.animals.Mammal;

public abstract class Elephant extends Mammal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Труба-ба-ба!");
    }

    public void spraySelf() {
        System.out.println(name + " поливає себе водою.");
    }

    @Override
    public void move() {
        System.out.println(name + " тупотить.");
    }
}
