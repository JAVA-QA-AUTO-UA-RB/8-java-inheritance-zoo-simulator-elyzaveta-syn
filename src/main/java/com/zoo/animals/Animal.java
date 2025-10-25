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
        System.out.println(name + " зараз їсть...");
        increaseEnergy(20);
    }

    public void sleep() {
        System.out.println(name + " зараз спить...");
        increaseEnergy(30);
    }

    protected void makeSound() {
        System.out.println("Кричить");
    }

    public void displayInfo() {
        System.out.println("Ім'я" + name +
                "\n Вік" + age +
                "\n Вага" + weight);
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

    public void increaseEnergy(int integer1) {
        energyLevel = Math.min(100, energyLevel + integer1);
    }

    public void decreaseEnergy(int integer2) {
        energyLevel = Math.max(1, energyLevel - integer2);
    }

    public void setEnergyLevel() {
        this.energyLevel = Math.max(1, Math.min(100, energyLevel));
    }

    public void setMakeSound() {
        makeSound();
    }
}
