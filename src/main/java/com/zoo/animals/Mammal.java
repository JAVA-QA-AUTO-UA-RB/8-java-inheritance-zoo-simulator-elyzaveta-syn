package com.zoo.animals;

public abstract class Mammal extends Animal {
    protected String furColour;

    public abstract void move();

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Стогне");
    }

    public void groom() {
        System.out.println("Хутро" + name + "зараз чистять.");
    }
}
