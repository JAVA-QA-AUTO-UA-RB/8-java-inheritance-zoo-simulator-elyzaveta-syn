package com.zoo.animals;

public abstract class Animal implements IEatable, ISleepable {
    protected String name;
    private int energyLevel;
    private int state;

    public Animal(String name) {
        this.name = name;
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

    public void increaseEnergy(int value) {
        energyLevel = Math.min(100, energyLevel + value);
    }

    public void decreaseEnergy(int value) {
        energyLevel = Math.max(1, energyLevel - value);
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

    public void setEnergyLevel() {
        this.energyLevel = Math.max(1, Math.min(100, energyLevel));
    }

    public void setState() {
        this.energyLevel = Math.max(1, Math.min(100, energyLevel));
    }
}
