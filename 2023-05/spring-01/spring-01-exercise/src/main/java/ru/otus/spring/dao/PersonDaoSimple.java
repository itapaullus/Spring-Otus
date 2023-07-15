package ru.otus.spring.dao;

import ru.otus.spring.domain.Person;

public class PersonDaoSimple implements PersonDao {
    private int age;
    public Person findByName(String name) {
        return new Person(name, this.age);
    }

    public void setDefault_age(String defaultAge) {
        this.age = Integer.parseInt(defaultAge);
    }
}
