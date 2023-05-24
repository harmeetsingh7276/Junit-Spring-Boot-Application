package com.junitbasic.junitSpringBootApplication.repository;

import com.junitbasic.junitSpringBootApplication.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person,Integer> {
//    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM PERSON s WHERE s.personId = ?1")
//    boolean isPersonExistsById(Integer id);

}
