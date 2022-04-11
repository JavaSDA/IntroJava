package com.company.oop.animal;

public class Bird extends Animal {

    // Define the properties
    private String color;
    private boolean doesItFly;

    public Bird(String name, int legs, String sound, String color, boolean doesItFly) {
        super(name, legs, sound);
        this.color = color;
        this.doesItFly = doesItFly;
    }


    public void fly() {
        if (doesItFly) System.out.println(super.getName() + " can fly");
        else System.out.println(super.getName() + " cannot fly");
    }

    public void sing() {
        System.out.println(super.getName() + " says " + super.getSound());
    }


}
