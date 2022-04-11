package com.company.oop.animal;

public class Animal {

    // Define fields
    private String name;
    private int legs;
    private String sound;

    public Animal(String name, int legs, String sound) {
        this.name = name;
        this.legs = legs;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    // define behaviour
    public void voice() {
        System.out.println(name + " says " + sound);
    }

}
