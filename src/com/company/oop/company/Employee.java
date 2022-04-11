package com.company.oop.company;

import com.company.person.Person;

public class Employee extends Person {

    // Define properties
    private Company company;

    // Define constructor

    public Employee(String name, int age, Company company) {
        super(name, age);
        this.company = company;
    }


    public Company getCompany() {
        return company;
    }
}
