package com.zoo.species;
import com.zoo.animals.Bird;

public class Penguin extends Bird implements IPlayable {
    public Penguin(String name, int age, int weight, int wingSpan) {
        super(name, age, weight, wingSpan);
    }

    public void swim() {
        greet();
        System.out.println("Плаваю в прохолодній воді.");
        decreaseEnergy(15);
    }

    private void surfOnIce() {
        greet();
        makeSound();
        System.out.println("Серфую по снігу!");
        decreaseEnergy(10);
    }

    @Override
    public void makeSound() {
        System.out.println("Кря-кря!");
    }

    @Override
    public void fly() {
        greet();
        makeSound();
        System.out.println("Я не літаю, але плаваю!");
        swim();
    }

    @Override
    public void uniqueBirdAction() {
        greet();
        surfOnIce();
    }

    @Override
    public void eat() {
        greet();
        System.out.println("Насолоджуюсь смачною рибою!");
        increaseEnergy(25);
    }

    @Override
    public void sleep() {
        greet();
        System.out.println("Плаваю в царстві Морфея.");
        increaseEnergy(32);
    }

    @Override
    public void play() {
        greet();
        makeSound();
        System.out.println("Я грайливо штовхаюсь!");
        decreaseEnergy(5);
    }
}
