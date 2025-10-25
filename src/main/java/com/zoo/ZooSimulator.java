package com.zoo;

import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {

        Lion goldenLion0 = new Lion("Гюррем", 7, 200);
        Lion goldenLion1 = new Lion("Сулейман", 10, 250);
        Lion goldenLion2 = new Lion("Міхрімах", 3, 150);
        Lion goldenLion3 = new Lion("Махідевран", 8, 175);

        Elephant forestElephant0 = new Elephant("Товстопуз", 5, 3000);
        Elephant forestElephant1 = new Elephant("Бантік-Срантік", 2, 1500);

        Eagle harpyEagle0 = new Eagle("Белла", 1, 6);
        Eagle harpyEagle1 = new Eagle("Бруно", 2, 7);
        Eagle harpyEagle2 = new Eagle("Ібрагім", 3, 7);

        Penguin emperorPenguin0 = new Penguin("Кінг", 1, 40);
        Penguin emperorPenguin1 = new Penguin("Сонік", 3, 45);

        ZooKeeper zookeeper0 = new ZooKeeper("Алекс", 21);
        ZooKeeper zooKeeper1 = new ZooKeeper("Олеся", 27);

        // - Годування тварин: використання методу feedAnimal().
        // - Гра з тваринами: використання методу playWithAnimal().
        // - Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().
        // Виведіть фінальні результати та стани тварин наприкінці дня.

    }
}
