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
        Eagle harpyEagle2 = new Eagle("Коко", 3, 7);

        Penguin emperorPenguin0 = new Penguin("Кінг", 1, 40);
        Penguin emperorPenguin1 = new Penguin("Сонік", 3, 45);

        ZooKeeper zookeeper0 = new ZooKeeper("Алекс", 21);
        ZooKeeper zooKeeper1 = new ZooKeeper("Олеся", 27);
        ZooKeeper zooKeeper2 = new ZooKeeper("Ксенія", 25);
        ZooKeeper zooKeeper3 = new ZooKeeper("Іван", 31);

        System.out.println("⁜ Звичний день у зоопарку \"Величне століття\" ⁜");
        zookeeper0.talk(zooKeeper1);
        System.out.println("Алекс подивився на відвідувачів та заговорив: \"Вітаємо у нашому зоопарку! Нумо подивимось на наш прайд левів!\"");

        goldenLion2.hunt();
        goldenLion2.makeSound();
        goldenLion3.eat();
        System.out.println("\n\"Цікаво, а де ж решта?\"\n");
        goldenLion1.sleep();
        goldenLion0.sleep();
        System.out.println("\n\"Нумо тепер подивимось на слонів!\"\n");
        forestElephant0.makeSound();
        forestElephant0.spraySelf();
        forestElephant1.eat();
        System.out.println("\n\"Недалеко від них живе родина молода родина гарпій. Дивіться-но!\"\n");
        harpyEagle0.fly();
        harpyEagle0.makeSound();
        harpyEagle1.eat();
        harpyEagle2.makeSound();
        harpyEagle2.eat();
        System.out.println("\n\"А в іншій частині в нас живе пара пінгвінів.\"\n");
        emperorPenguin0.eat();
        emperorPenguin0.makeSound();
        emperorPenguin1.fly();

        // - Годування тварин: використання методу feedAnimal().

        System.out.println("\nДоки відвідувачі пішли на екскурсію, працівники піклуються про тваринок...\n");
        zooKeeper1.feedAnimal(goldenLion0);
        zooKeeper1.feedAnimal(goldenLion1);
        zooKeeper1.feedAnimal(goldenLion2);
        zooKeeper1.feedAnimal(goldenLion3);
        zooKeeper2.washAnimal(forestElephant0);
        zookeeper0.playWithAnimal(forestElephant1);
        zooKeeper3.feedAnimal(harpyEagle0);
        zooKeeper3.feedAnimal(harpyEagle1);
        zooKeeper3.washAnimal(harpyEagle2);
        zooKeeper2.playWithAnimal(emperorPenguin0);
        zooKeeper2.playWithAnimal(emperorPenguin1);

        // - Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().

        // Виведіть фінальні результати та стани тварин наприкінці дня.

    }
}
