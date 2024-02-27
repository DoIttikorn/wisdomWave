package com.school.teacher.person.usecase;

import com.school.teacher.person.model.Teacher;
import com.school.teacher.person.repository.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class FindPeople {

    private final PersonRepository repository;

    public FindPeople(PersonRepository repository) {
        this.repository = repository;

    }

    public Flux<Teacher> execute() {
        return repository.findAll();
    }
}
