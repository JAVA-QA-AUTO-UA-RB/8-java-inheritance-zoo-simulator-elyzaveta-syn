package com.zoo.species;
import com.zoo.animals.Bird;

public class Penguin extends Bird {
    public Penguin(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Кря-кря!");
        super.makeSound();
    }

    public void swim() {
        System.out.println(name + " пливе.");
    }

    @Override
    public void fly() {
        System.out.println("Пінгвін не літає, але плаває");
        swim();
    }

}
