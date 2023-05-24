package com.junitbasic.junitSpringBootApplication.services;

import com.junitbasic.junitSpringBootApplication.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {
    //Don't autowire this as it will fetch the actual data from the DB
    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        this.personService = new PersonService(this.personRepository);
    }

    @Test
    void getAllPerson() {
        personService.getAllPerson();
        verify(personRepository).findAll();
    }
}