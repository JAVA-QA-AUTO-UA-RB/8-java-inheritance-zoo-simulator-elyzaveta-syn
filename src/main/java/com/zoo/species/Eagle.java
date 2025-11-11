package com.zoo.species;
import com.zoo.animals.Bird;

public abstract class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
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

    private void buildNest() {
        System.out.println(name + " будує гніздо.");
    }

    @Override
    public void uniqueBirdAction() {
        buildNest();
    }
}
