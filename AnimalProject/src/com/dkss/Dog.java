package com.dkss;

public class Dog extends Animal {


    private int eyes;
    private int tail;
    private int ears;


    public Dog(String name, int brain, int weight,int eyes, int tail, int ears) {
        super(name, brain, weight);

        this.ears=ears;
        this.eyes=eyes;
        this.tail=tail;

    }

    private void chew(){

    }

    @Override
    public void eat() {

        System.out.println("Eat called");
        chew();
        super.eat();
    }
}
