package com.luv2code.springboot.cruddemo.entity;

public class Student {

    //Define fields
    private String name;
    private String lastName;
    private String email;
    private Employee employee;

    //Default Constructor
    public Student(){

    }
    //Constructor from fields

    public Student(String name, String lastName, String email, Employee employee) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.employee = employee;
    }
// Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //To string method overriden
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employee='" + employee + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
