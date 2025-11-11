package com.zoo.species;
import com.zoo.animals.Mammal;

public class Lion extends Mammal implements IPlayable {
    public Lion(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void hunt(){
        System.out.println(name + " полює.");
        decreaseEnergy(25);
    }

    @Override
    public void makeSound() {
        System.out.println("Рррр!");
    }

    @Override
    public void move() {
        System.out.println(name + " гуляє територією.");
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " спить.");
    }

    @Override
    public void play() {
        System.out.println(name + " грається.");
    }
}
