package com.guide08.exercise.exercise07.service;

import com.guide08.exercise.exercise07.entity.Person;

import java.util.Objects;

public class PersonService {
    Person person;

    public PersonService() {
    }

    public PersonService(Person person) {
        this.person = person;
    }

    /**
     * Create a person with all attributes from class Person and validate sex
     */
    public void createPerson(String name, int age, String sex, double weight, double height){
        if (Objects.equals(sex, "H") || Objects.equals(sex, "M") || Objects.equals(sex, "O")){
            person.setName(name);
            person.setAge(age);
            person.setWeight(weight);
            person.setHeight(height);
            person.setSex(sex);
        }
        else{
            System.out.println("Sexo incorrecto");
        }
    }

    public int calculateIMC(){
        double imc = person.getWeight() / Math.pow(person.getHeight(), 2);
        if (imc < 20){
            return -1;
        }
        else if (imc >= 20 && imc <= 25){
            return 0;
        }
        else{
            return 1;
        }
    }

    public boolean isAdult(){
        return person.getAge() >= 18;
    }

}
