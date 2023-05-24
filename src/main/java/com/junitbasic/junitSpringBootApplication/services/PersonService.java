package com.junitbasic.junitSpringBootApplication.services;

import com.junitbasic.junitSpringBootApplication.entity.Person;
import com.junitbasic.junitSpringBootApplication.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepo;
    public List<Person> getAllPerson() {
        return this.personRepo.findAll();
    }
}
