package com.company.person;

public class Persons {

    // define properties of the class
    private Person[] people;

    public Persons(Person[] people) {
        this.people = people;
    }

    // person[i].getAge()
    // person.getAge()
    public float getAverageAge() {
        float sum = 0; // initialize the sum variable to zero
        // for-each loop
        for(Person person : people) {
            // person == person[i]
            sum += person.getAge();
        }

        return sum / people.length;
    }

}
