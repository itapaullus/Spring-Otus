package ru.otus.spring.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Person {

    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
