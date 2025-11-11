package com.zoo.species;
import com.zoo.animals.Bird;

public abstract class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Кря-кря!");
    }

    public void swim() {
        System.out.println(name + " пливе.");
    }

    @Override
    public void fly() {
        System.out.println(name + " не літає, але плаває");
    }

    private void surfOnIce() {
        System.out.println(name + " серфить по льоду.");
    }

    @Override
    public void uniqueBirdAction() {
        surfOnIce();
    }
}
