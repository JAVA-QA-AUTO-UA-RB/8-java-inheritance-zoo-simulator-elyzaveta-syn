package com.zoo.animals;

abstract class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    protected String furColour;

    abstract void move();

    @Override
    public void makeSound() {
        System.out.println("Стогне");
    }

    public void groom() {
        System.out.println("Хутро" + name + "зараз чистять.");
    }
}
