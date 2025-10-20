package com.zoo.animals;

public class Bird extends Animal {
    public Bird(String name, int age, int weight) {
        super(name, age, weight);
    }

    protected int wingSpan;

    @Override
    public void makeSound() {
        System.out.println("Sing");
        super.makeSound();
    }

    public void fly() {
        System.out.println(name + " is flying.");
        decreaseEnergy(15);
    }
}
