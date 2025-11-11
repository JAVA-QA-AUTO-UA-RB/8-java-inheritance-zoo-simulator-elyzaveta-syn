package com.zoo.animals;

public abstract class Bird extends Animal {
    protected int wingSpan;

    public abstract void uniqueBirdAction();

    public Bird(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Цвірінькає");
    }

    public void fly() {
        System.out.println(name + " літає.");
        decreaseEnergy(15);
    }
}
