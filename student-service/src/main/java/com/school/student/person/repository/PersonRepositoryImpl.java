package com.school.student.person.repository;

import com.school.student.person.model.Student;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public Mono<Student> findAll() {
        return Mono.just(new Student("John", "Doe", "email", "phone", "address"));
    }
}
