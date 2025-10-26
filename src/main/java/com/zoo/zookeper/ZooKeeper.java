package com.zoo.zookeper;

import com.zoo.animals.Animal;

public class ZooKeeper {

    private String name;
    private int age;

    public ZooKeeper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk(ZooKeeper interlocutor) {
        System.out.println(name + " говорить з " + interlocutor.getName());
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " годує " + animal.getName());
    }

    public void playWithAnimal(Animal animal) {
        System.out.println(name + " грається з " + animal.getName());
        animal.setMakeSound();
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        System.out.println(name + "перевіряє рівень енергії" + animal.getName());
        int energyLevel = animal.getEnergyLevel();
        System.out.println("Рівень енергії " + animal.getName() + " дорівнює " + energyLevel);
        if (energyLevel <= 30) {
            System.out.println(animal.getName() + " має низький рівень енергії.");
        } else if (energyLevel == 31 && energyLevel <= 70) {
            System.out.println(animal.getName() + " має середній рівень енергії.");
        } else {
            System.out.println(animal.getName() + " має високий рівень енергії.");
        }
    }

    public void washAnimal(Animal animal) {
        System.out.println(name + " чистить " + animal.getName());
        animal.setMakeSound();
    }

    public String getName() {
        return name;
    }
}