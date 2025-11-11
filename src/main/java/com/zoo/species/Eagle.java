package com.zoo.species;
import com.zoo.animals.Bird;

public class Eagle extends Bird implements IPlayable {
    public Eagle(String name, int age, int weight) {
        super(name, age, weight);
    }

    private void buildNest() {
        System.out.println(name + " будує гніздо.");
    }

    @Override
    public void makeSound() {
        System.out.println("Кріі-кріі!");
    }

    @Override
    public void fly() {
        System.out.println(name + " летить.");
        decreaseEnergy(20);
    }

    @Override
    public void uniqueBirdAction() {
        buildNest();
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
