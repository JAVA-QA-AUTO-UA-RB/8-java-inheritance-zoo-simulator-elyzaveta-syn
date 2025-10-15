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

    public void eat() {
        System.out.println(name + " is eating...");
        energyLevel = this.energyLevel + 20;
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
        energyLevel = this.energyLevel + 30;
    }

    protected void makeSound() {
        System.out.println("Scream");
    }

    public void displayInfo() {
        System.out.println("Name" + name +
                "\n Age" + age +
                "\n Weight" + weight);
    }

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
