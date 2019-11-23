package com.dkss;

public class Animal {

    private String name;
    private int brain;
    private int weight;

    public Animal(String name, int brain, int weight) {
        this.name = name;
        this.brain = brain;
        this.weight = weight;
    }


    public void eat()
    {
        System.out.println("Eat method called");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }
}
