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
        System.out.println(name + " is eating...");
        energyLevel = this.energyLevel + 20;
    }

    // збільшує енергію на 30
    public void sleep() {
        System.out.println(name + " is sleeping...");
        energyLevel = this.energyLevel + 30;
    }

    // виводить загальний звук
    protected void makeSound() {
        System.out.println("Rrrawwrr");
    }

    // виводить інформацію про тварину
    public void displayInfo() {
        System.out.println("Name" + name +
                "\n Age" + age +
                "\n Weight" + weight);
    }

    // публічні Геттери для всіх полів
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
}
