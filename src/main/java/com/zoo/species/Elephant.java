package com.zoo.species;
import com.zoo.animals.Mammal;

public class Elephant extends Mammal {
    public Elephant(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void spraySelf() {
        System.out.println(name + " поливає себе водою.");
    }

    @Override
    public void makeSound() {
        System.out.println("Труба-ба-ба!");
    }

    @Override
    public void move() {
        System.out.println(name + " тупотить.");
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " спить.");
    }
}
