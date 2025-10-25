package com.zoo.species;
import com.zoo.animals.Mammal;

public class Lion extends Mammal {
    public Lion(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Рррр!");
    }

    public void hunt(){
        System.out.println(name + " полює.");
        decreaseEnergy(25);
    }

    public String getName() {
        return name;
    }
}
