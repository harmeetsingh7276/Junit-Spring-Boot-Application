package com.junitbasic.junitSpringBootApplication.services;

import com.junitbasic.junitSpringBootApplication.entity.Person;
import com.junitbasic.junitSpringBootApplication.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public List<Person> getAllPerson() {
        return this.personRepository.findAll();
    }
}
