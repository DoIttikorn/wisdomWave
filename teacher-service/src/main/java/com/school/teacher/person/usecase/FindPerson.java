package com.school.teacher.person.usecase;

import com.school.teacher.person.model.Teacher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FindPerson {

    public Mono<Teacher> execute() {
        return Mono.just(new Teacher("John", "Doe", "email", "phone"));
    }
}
