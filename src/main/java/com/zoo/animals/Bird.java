package com.zoo.animals;

abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    protected int wingSpan;

    @Override
    public void makeSound() {
        System.out.println("Цвірінькає");
    }

    public void fly() {
        System.out.println(name + " літає.");
        decreaseEnergy(15);
    }
}
