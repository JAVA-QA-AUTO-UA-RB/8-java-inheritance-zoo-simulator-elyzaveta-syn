package com.zoo.animals;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    protected int wingSpan;

    public abstract void uniqueBirdAction();

    @Override
    public void makeSound() {
        System.out.println("Цвірінькає");
    }

    public void fly() {
        System.out.println(name + " літає.");
        decreaseEnergy(15);
    }
}
