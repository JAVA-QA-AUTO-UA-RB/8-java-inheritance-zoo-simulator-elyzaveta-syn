package com.zoo;

import com.zoo.animals.IEatable;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {

    public static void main(String[] args) {

        Lion goldenLion0 = new Lion("Гюррем", 7, 200, "темно-золоте");
        Lion goldenLion1 = new Lion("Сулейман", 10, 250, "класично-золоте");
        Lion goldenLion2 = new Lion("Міхрімах", 3, 150, "світло-золоте");
        Lion goldenLion3 = new Lion("Махідевран", 8, 175, "класично-золоте");

        Elephant forestElephant0 = new Elephant("Товстопуз", 5, 3000, "не має хутра");
        Elephant forestElephant1 = new Elephant("Бантік-Срантік", 2, 1500, "не має хутра");

        Eagle harpyEagle0 = new Eagle("Белла", 1, 6, 1.5);
        Eagle harpyEagle1 = new Eagle("Бруно", 2, 7, 2);
        Eagle harpyEagle2 = new Eagle("Коко", 3, 7, 2.2);

        Penguin emperorPenguin0 = new Penguin("Кінг", 1, 40, 1);
        Penguin emperorPenguin1 = new Penguin("Сонік", 3, 45, 1.2);

        ZooKeeper zookeeper0 = new ZooKeeper("Алекс", 21);
        ZooKeeper zooKeeper1 = new ZooKeeper("Олеся", 27);
        ZooKeeper zooKeeper2 = new ZooKeeper("Ксенія", 25);
        ZooKeeper zooKeeper3 = new ZooKeeper("Іван", 31);

        List<IEatable> animalsDiet = new ArrayList<>();
        animalsDiet.add(goldenLion0);
        animalsDiet.add(forestElephant0);
        animalsDiet.add(harpyEagle0);
        animalsDiet.add(emperorPenguin0);

        System.out.println("⁜ Звичний день у зоопарку \"Величне століття\" ⁜\n");
        zookeeper0.talk(zooKeeper1);
        System.out.println("Алекс подивився на відвідувачів та заговорив: \"Вітаємо у нашому зоопарку! Нумо подивимось на наш прайд левів!\"");

        goldenLion2.hunt();
        goldenLion3.move();
        System.out.println("\n\"Цікаво, а де ж решта?\"\n");
        goldenLion1.sleep();
        goldenLion0.sleep();
        System.out.println("\n\"Нумо тепер подивимось на слонів!\"\n");
        forestElephant0.spraySelf();
        forestElephant1.eat();
        System.out.println("\n\"Недалеко від них живе родина молода родина гарпій. Дивіться-но!\"\n");
        harpyEagle0.fly();
        harpyEagle1.uniqueBirdAction();
        harpyEagle2.play();
        System.out.println("\n\"А в іншій частині в нас живе пара пінгвінів.\"\n");
        emperorPenguin0.uniqueBirdAction();
        emperorPenguin1.fly();

        System.out.println("\n\"А чи знаєте ви, що ці звірята їдять?\"\n");
        for (IEatable animal : animalsDiet) {
            System.out.println();
            animal.eat();
        }


        System.out.println("\nДоки відвідувачі пішли на екскурсію, працівники піклуються про тваринок...\n");
        zooKeeper1.feedAnimal(goldenLion0);
        zooKeeper1.feedAnimal(goldenLion1);
        zooKeeper1.washAnimal(goldenLion2);
        goldenLion2.groom();
        zooKeeper1.feedAnimal(goldenLion3);
        zooKeeper2.washAnimal(forestElephant0);
        forestElephant0.groom();
        zooKeeper3.feedAnimal(harpyEagle0);
        zooKeeper3.feedAnimal(harpyEagle1);
        zooKeeper3.washAnimal(harpyEagle2);
        harpyEagle2.groom();
        zooKeeper2.feedAnimal(emperorPenguin0);
        zooKeeper2.washAnimal(emperorPenguin1);
        emperorPenguin1.groom();

        System.out.println("\nТакож усі тваринки мають свій власний час — без відвідувачів!\n");
        forestElephant0.move();
        forestElephant1.play();
        forestElephant0.play();
        forestElephant1.spraySelf();
        forestElephant0.spraySelf();
        emperorPenguin0.play();
        emperorPenguin1.play();
        emperorPenguin0.uniqueBirdAction();
        zooKeeper1.playWithAnimal(goldenLion2);
        goldenLion0.play();
        goldenLion3.hunt();
        goldenLion3.eat();
        goldenLion1.move();
        goldenLion1.hunt();
        zooKeeper3.playWithAnimal(harpyEagle0);
        harpyEagle0.play();
        zooKeeper3.playWithAnimal(harpyEagle2);
        harpyEagle2.play();
        harpyEagle1.uniqueBirdAction();
        harpyEagle0.uniqueBirdAction();

        System.out.println("\nПотім усі відпочивають...\n");
        goldenLion0.sleep();
        goldenLion1.sleep();
        goldenLion2.sleep();
        goldenLion3.sleep();
        forestElephant0.sleep();
        forestElephant1.sleep();
        harpyEagle0.sleep();
        harpyEagle1.sleep();
        harpyEagle2.sleep();
        emperorPenguin0.sleep();
        emperorPenguin1.sleep();

        System.out.println("\nВ кінці дня, працівники завжди перевіряють стан тварин.\n");
        zookeeper0.checkAnimalEnergyLevel(goldenLion0);
        zookeeper0.checkAnimalEnergyLevel(goldenLion1);
        zookeeper0.checkAnimalEnergyLevel(goldenLion2);
        zookeeper0.checkAnimalEnergyLevel(goldenLion3);
        zooKeeper1.checkAnimalEnergyLevel(forestElephant0);
        zooKeeper1.checkAnimalEnergyLevel(forestElephant1);
        zooKeeper2.checkAnimalEnergyLevel(harpyEagle0);
        zooKeeper2.checkAnimalEnergyLevel(harpyEagle1);
        zooKeeper2.checkAnimalEnergyLevel(harpyEagle2);
        zooKeeper3.checkAnimalEnergyLevel(emperorPenguin0);
        zooKeeper3.checkAnimalEnergyLevel(emperorPenguin1);

        System.out.println("\nПотім треба заповнити звіти.\n");
        goldenLion0.displayInfo();
        goldenLion0.displayAnimalState();
        goldenLion1.displayInfo();
        goldenLion1.displayAnimalState();
        goldenLion2.displayInfo();
        goldenLion2.displayAnimalState();
        goldenLion3.displayInfo();
        goldenLion3.displayAnimalState();
        forestElephant0.displayInfo();
        forestElephant0.displayAnimalState();
        forestElephant1.displayInfo();
        forestElephant1.displayAnimalState();
        harpyEagle0.displayInfo();
        harpyEagle0.displayAnimalState();
        harpyEagle1.displayInfo();
        harpyEagle1.displayAnimalState();
        harpyEagle2.displayInfo();
        harpyEagle2.displayAnimalState();
        emperorPenguin0.displayInfo();
        emperorPenguin0.displayAnimalState();
        emperorPenguin1.displayInfo();
        emperorPenguin1.displayAnimalState();
    }
}
