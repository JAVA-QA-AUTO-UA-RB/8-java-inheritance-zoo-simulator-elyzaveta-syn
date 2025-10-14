package com.zoo.animals;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    private int energyLevel;

    // збільшує енергію на 20
    public void eat() {
        System.out.println("");
    }

    // збільшує енергію на 30
    public void sleep() {
        System.out.println("");
    }

    // виводить загальний звук
    protected void makeSound() {
        System.out.println("");
    }

    // виводить інформацію про тварину
    public void displayInfo() {
        System.out.println("");
    }

    // публічні Геттери для всіх полів
}
