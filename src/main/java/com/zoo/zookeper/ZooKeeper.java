package com.zoo.zookeper;

import com.zoo.animals.Animal;

public class ZooKeeper {

    private String name;
    private int age;

    public ZooKeeper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " годує" + animal);
    }

    public void playWithAnimal(Animal animal) {
        System.out.println(name + " грається з" + animal);
        animal.setMakeSound();
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        System.out.println(name + "перевіряє рівень енергії" + animal);
        int energyLevel = animal.getEnergyLevel();
        System.out.println("Рівень енергії " + animal + " дорівнює " + energyLevel);
        if (energyLevel <= 30) {
            System.out.println(animal + " має низький рівень енергії.");
        } else if (energyLevel == 31 && energyLevel <= 70) {
            System.out.println(animal + " має середній рівень енергії.");
        } else {
            System.out.println(animal + " має високий рівень енергії.");
        }
    }
}