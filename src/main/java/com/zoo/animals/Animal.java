package com.zoo.animals;

public abstract class Animal {
    protected String name;
    private int energyLevel;
    private int state;

    public Animal(String name) {
        this.name = name;
    }

    interface IEatable {
        void eat();
    }

    interface ISleepable {
        void sleep();
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Ім'я: " + name);
    }

    public void displayAnimalState() {
        int state = getState();
        if (state <= 30) {
            System.out.println("Стан " + getName() + " : виснажена.");
        } else if (state == 31 && state <= 70) {
            System.out.println("Стан " + getName() + " : задоволена.");
        } else {
            System.out.println("Стан " + getName() + " : повна енергії.");
        }
    }

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getState() {
        return state;
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

    public void setState() {
        this.energyLevel = Math.max(1, Math.min(100, energyLevel));
    }
}
