package com.example.RestFullApp;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
    Long id;
    String name;
    int salary;
    int skills;
    Animal animal;

    public Doctor() {
        animal = new Animal();
    }

    public Doctor(Long id, String name, int salary, int skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skills = skills;
    }

    public Doctor(Long id, String name, int salary, int skills, Animal animal) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skills = skills;
        this.animal = animal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSkills() {
        return skills;
    }

    public void setSkills(int skills) {
        this.skills = skills;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "com.example.RestFullApp.Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skills=" + skills +
                ", animal=" + animal +
                '}';
    }
}
