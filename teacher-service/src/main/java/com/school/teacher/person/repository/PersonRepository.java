package com.school.teacher.person.repository;


import com.school.teacher.person.model.Teacher;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Teacher, Integer> {
}
