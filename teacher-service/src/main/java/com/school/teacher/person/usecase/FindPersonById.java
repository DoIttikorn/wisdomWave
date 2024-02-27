package com.school.teacher.person.usecase;

import com.school.teacher.person.model.Teacher;
import com.school.teacher.person.repository.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FindPersonById {

    private final PersonRepository repository;

    public FindPersonById(PersonRepository repository) {
        this.repository = repository;
    }

    public Mono<Teacher> execute(int id) {
        return repository.findById(id);
    }
}
