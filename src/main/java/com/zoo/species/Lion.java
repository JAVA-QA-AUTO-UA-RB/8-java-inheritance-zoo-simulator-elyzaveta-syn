package com.zoo.species;
import com.zoo.animals.Mammal;

public abstract class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Рррр!");
    }

    public void hunt(){
        System.out.println(name + " полює.");
        decreaseEnergy(25);
    }

    @Override
    public void move() {
        System.out.println(name + " гуляє територією.");
    }
}
