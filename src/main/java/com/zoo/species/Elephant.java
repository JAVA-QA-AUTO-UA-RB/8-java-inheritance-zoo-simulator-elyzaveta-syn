package com.zoo.species;
import com.zoo.animals.Mammal;

public class Elephant extends Mammal implements IPlayable {
    public Elephant(String name, int age, int weight, String furColour) {
        super(name, age, weight, furColour);
    }

    public void spraySelf() {
        greet();
        makeSound();
        System.out.println("Насолоджуюсь теплою водою та поливаю себе!");
        increaseEnergy(5);
    }

    @Override
    public void makeSound() {
        System.out.println("Труба-ба-ба!");
    }

    @Override
    public void move() {
        greet();
        makeSound();
        System.out.println("Радісно тупаю ногами!");
        decreaseEnergy(10);
    }

    @Override
    public void eat() {
        greet();
        System.out.println("Я смакую листям!");
        increaseEnergy(25);
    }

    @Override
    public void sleep() {
        greet();
        System.out.println("Гуляю в царстві Морфея!");
        increaseEnergy(30);
    }

    @Override
    public void play() {
        greet();
        makeSound();
        System.out.println("Грайливо розкидую іграшки!");
        decreaseEnergy(10);
    }

    @Override
    public void groom() {
        greet();
        System.out.println("Мою шкіру зараз миють!");
    }
}
