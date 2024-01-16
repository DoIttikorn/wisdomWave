package com.school.student.person.usecase;

import com.school.student.person.model.Student;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FindPerson {

    public Mono<Student> execute() {
        return Mono.just(new Student("John", "Doe", "email", "phone", "address"));
    }
}
