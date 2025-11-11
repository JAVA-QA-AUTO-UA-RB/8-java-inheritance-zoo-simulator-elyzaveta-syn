package com.zoo.species;
import com.zoo.animals.Bird;

public class Eagle extends Bird implements IPlayable {
    public Eagle(String name, int age, int weight, double wingSpan) {
        super(name, age, weight, wingSpan);
    }

    private void buildNest() {
        greet();
        System.out.println("Кропітливо будую гніздо.");
        decreaseEnergy(25);
    }

    @Override
    public void makeSound() {
        System.out.println("Кріі-кріі!");
    }

    @Override
    public void fly() {
        greet();
        makeSound();
        System.out.println("Розрізаю крилами небокрай!");
        decreaseEnergy(35);
    }

    @Override
    public void uniqueBirdAction() {
        greet();
        buildNest();
    }

    @Override
    public void eat() {
        greet();
        System.out.println("Я насолоджуюсь мняском!");
        increaseEnergy(23);
    }

    @Override
    public void sleep() {
        greet();
        System.out.println("Літаю в царстві Морфея!");
        increaseEnergy(30);
    }

    @Override
    public void play() {
        greet();
        makeSound();
        System.out.println("Ловлю іграшки в польоті!");
        decreaseEnergy(30);
    }
}
