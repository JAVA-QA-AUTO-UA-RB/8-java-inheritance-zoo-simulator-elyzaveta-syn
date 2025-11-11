package com.zoo.animals;

public abstract class Animal implements IEatable, ISleepable {
    protected String name;
    protected int age;
    protected int weight;
    private int energyLevel;
    private int state;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeSound();

    public void greet() {
        System.out.println("Йой! Це ж " + name);
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name +
                "\n Вік: " + age +
                "\n Вага: " + weight);
    }

    public void displayAnimalState() {
        int state = getEnergyLevel();
        if (state <= 30) {
            System.out.println("Стан " + getName() + " : виснажена.");
        } else if (state == 31 && state <= 70) {
            System.out.println("Стан " + getName() + " : задоволена.");
        } else {
            System.out.println("Стан " + getName() + " : повна енергії.");
        }
    }

    public void increaseEnergy(int value) {
        energyLevel = Math.min(100, energyLevel + value);
    }

    public void decreaseEnergy(int value) {
        energyLevel = Math.max(1, energyLevel - value);
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

    public int getState() {
        return state;
    }

    public void setEnergyLevel() {
        this.energyLevel = Math.max(1, Math.min(100, energyLevel));
    }
}
