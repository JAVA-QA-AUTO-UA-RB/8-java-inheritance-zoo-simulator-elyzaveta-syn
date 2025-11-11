package com.zoo.species;
import com.zoo.animals.Mammal;

public class Lion extends Mammal implements IPlayable {
    public Lion(String name, int age, int weight, String furColour) {
        super(name, age, weight, furColour);
    }

    public void hunt(){
        greet();
        makeSound();
        System.out.println("Я полюю!");
        decreaseEnergy(25);
    }

    @Override
    public void makeSound() {
        System.out.println("Рррр!");
    }

    @Override
    public void move() {
        greet();
        System.out.println("Гуляю територією.");
        decreaseEnergy(5);
    }

    @Override
    public void eat() {
        greet();
        makeSound();
        System.out.println("Я насолоджуюсь мняском!");
        increaseEnergy(30);
    }

    @Override
    public void sleep() {
        greet();
        System.out.println("Гуляю в царстві Морфея!");
        increaseEnergy(35);
    }

    @Override
    public void play() {
        greet();
        makeSound();
        System.out.println("Грайливо кусаю!");
        decreaseEnergy(5);
    }
}
