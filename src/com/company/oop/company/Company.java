package com.company.oop.company;

import com.company.person.Person;

public class Company {

    // Define properties
    private String companyName;
    private Employee[] employees;

    // Define constructor
    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public float getAverageAge() {
        float sum = 0; // initialize the sum variable to zero
        // for-each loop
        for(Person person : employees) {
            // person == person[i]
            sum += person.getAge();
        }

        return sum / employees.length;
    }
}
