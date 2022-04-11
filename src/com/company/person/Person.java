package com.company.person;

public class Person {

    // Define the properties or attributes of a person
    private String name;
    private int age;
    private float height;
    private float weight;



    // Constructor - A constructor is a utility that allows us to
    // create instances of objects

    // Method/Constructor overloading -> This is a way to define multiple constructors or methods
    // with the same name but they must have different method/constructor signatures.

    // Method/Constructor signatures -> This is the number and data type of the parameters and
    // the order in which those parameters are defined.
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters - allow us read data from the class
    // setters - allow us write data to the class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void changeAge() {
        age++;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // BMI formula = kg / m^2 (weight / height^2)

    public float getBMI() {
        return weight / (height * height);
    }

}
