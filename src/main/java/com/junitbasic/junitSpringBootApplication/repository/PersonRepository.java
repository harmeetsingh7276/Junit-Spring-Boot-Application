package com.junitbasic.junitSpringBootApplication.repository;

import com.junitbasic.junitSpringBootApplication.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Person p WHERE p.id = :id")
    boolean isPersonExistsById(@Param("id") Integer id);


}
