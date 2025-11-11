package com.zoo.species;
import com.zoo.animals.Bird;

public class Penguin extends Bird {
    public Penguin(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void swim() {
        System.out.println(name + " пливе.");
    }

    private void surfOnIce() {
        System.out.println(name + " серфить по льоду.");
    }

    @Override
    public void makeSound() {
        System.out.println("Кря-кря!");
    }

    @Override
    public void fly() {
        System.out.println(name + " не літає, але плаває");
    }

    @Override
    public void uniqueBirdAction() {
        surfOnIce();
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " спить.");
    }
}
