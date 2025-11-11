package com.zoo.animals;

public abstract class Bird extends Animal {
    protected double wingSpan;

    public abstract void uniqueBirdAction();

    public Bird(String name, int age, int weight, double wingSpan) {
        super(name, age, weight);
        this.wingSpan = wingSpan;
    }

    public void fly() {
        greet();
        System.out.println("Я лечу!");
        decreaseEnergy(15);
    }

    public void groom() {
        greet();
        System.out.println("Моє пір'я зараз чистять!");
    }

    @Override
    public void makeSound() {
        System.out.println("Цвірінькає");
    }

    @Override
    public void displayInfo() {
        System.out.println("Ім'я: " + name +
                "\n Вік: " + age +
                "\n Вага: " + weight +
                "\n Розмах крил: " + wingSpan + " метрів");
    }

    public double getWingSpan() {
        return wingSpan;
    }
}
