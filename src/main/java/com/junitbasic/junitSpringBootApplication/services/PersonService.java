package com.junitbasic.junitSpringBootApplication.services;

import com.junitbasic.junitSpringBootApplication.entity.Person;
import com.junitbasic.junitSpringBootApplication.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    public List<Person> getAllPerson() {
        return this.personRepository.findAll();
    }

    public PersonService(PersonRepository repo) {
        this.personRepository = repo;
    }
}
