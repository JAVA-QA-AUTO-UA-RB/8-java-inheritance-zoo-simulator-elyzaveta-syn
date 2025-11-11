package com.zoo.zookeper;

import com.zoo.animals.Animal;
import com.zoo.animals.IEatable;
import com.zoo.species.IPlayable;

public class ZooKeeper {
    private String name;
    private int age;

    public ZooKeeper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Гей! Це " + name);
    }

    public void talk(ZooKeeper interlocutor) {
        System.out.println(name + " говорить з " + interlocutor.getName());
    }

    public void feedAnimal(IEatable animal) {
        greet();
        System.out.println("Даю смаколики тваринці!");
        animal.eat();
    }

    public void playWithAnimal(IPlayable animal) {
        greet();
        System.out.println("Розважаю та одночасно треную звірятко!");
        animal.play();
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        System.out.println(name + " перевіряє рівень енергії " + animal.getName());
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
        greet();
        System.out.println("Зараз я дбайливо чищу тваринку!");
        animal.makeSound();
    }

    public String getName() {
        return name;
    }
}