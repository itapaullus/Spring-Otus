package ru.otus.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.spring.dao.PersonDao;
import ru.otus.spring.domain.Person;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    @Autowired  // ее тут можно не писать, но если >1 конструктора, то так нужно пометить нужный для спринга
    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
