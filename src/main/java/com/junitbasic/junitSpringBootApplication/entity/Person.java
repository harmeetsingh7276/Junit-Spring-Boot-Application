package com.junitbasic.junitSpringBootApplication.entity;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer personId;
    private String personName;
    private String personCity;

    public Person() {

    }

    public Person(Integer id, String name, String city) {
        this.personId = id;
        this.personName = name;
        this.personCity = city;
    }

}
