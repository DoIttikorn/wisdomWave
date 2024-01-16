package com.school.student.person.repository;

import com.school.student.person.model.Student;
import reactor.core.publisher.Mono;

public interface PersonRepository {

    Mono<Student> findAll();
}
