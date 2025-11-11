package com.zoo.animals;

public abstract class Mammal extends Animal {
    protected String furColour;

    public abstract void move();

    public Mammal(String name, int age, int weight, String furColour) {
        super(name, age, weight);
        this.furColour = furColour;
    }

    public void groom() {
        greet();
        System.out.println("Моє хутро зараз чистять!");
    }

    @Override
    public void makeSound() {
        System.out.println("Стогне");
    }

    @Override
    public void displayInfo() {
        System.out.println("Ім'я: " + name +
                "\n Вік: " + age +
                "\n Вага: " + weight +
                "\n Колір хутра: " + furColour);
    }

    public String getFurColour() {
        return furColour;
    }
}
