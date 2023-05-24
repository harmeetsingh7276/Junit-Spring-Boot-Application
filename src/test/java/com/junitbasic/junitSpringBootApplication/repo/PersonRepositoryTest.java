package com.junitbasic.junitSpringBootApplication.repo;

import com.junitbasic.junitSpringBootApplication.entity.Person;
import com.junitbasic.junitSpringBootApplication.repository.PersonRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void isPersonExistsById() {
        Person person = new Person(123, "Harmeet", "Pune");
        personRepository.save(person);

        boolean actualResult=personRepository.isPersonExistsById(123);

        assertThat(actualResult).isTrue();
    }

    @AfterEach
    void tearDown(){
        //This method runs by default after test case execution is over
        System.out.println("Tearing Down");
        personRepository.deleteAll();
    }

    @BeforeEach
    void setup(){
        //This method runs by default before test case execution is started
        System.out.println("Setting up");
    }

}