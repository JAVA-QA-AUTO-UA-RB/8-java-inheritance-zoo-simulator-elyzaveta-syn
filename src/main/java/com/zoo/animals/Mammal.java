package com.zoo.animals;

public class Mammal extends Animal {
    public Mammal(String name, int age, int weight) {
        super(name, age, weight);
    }

    protected String furColour;

    @Override
    public void makeSound() {
        System.out.println("Grunt");
        super.makeSound();
    }

    public void groom() {
        System.out.println(name + "'s fur is being groomed.");
    }
}
