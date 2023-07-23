package ru.otus.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.spring.dao.PersonDao;
import ru.otus.spring.domain.Person;

@Service("personService")
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
