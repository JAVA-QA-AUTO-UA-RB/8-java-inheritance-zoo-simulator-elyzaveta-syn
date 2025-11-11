package com.zoo.animals;

public abstract class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    protected String furColour;

    public abstract void move();

    @Override
    public void makeSound() {
        System.out.println("Стогне");
    }

    public void groom() {
        System.out.println("Хутро" + name + "зараз чистять.");
    }
}
