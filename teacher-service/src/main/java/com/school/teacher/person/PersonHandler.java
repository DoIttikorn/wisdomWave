package com.school.teacher.person;

import com.school.teacher.person.model.Teacher;
import com.school.teacher.person.usecase.FindPerson;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PersonHandler {

    private final FindPerson findPerson;

    PersonHandler(FindPerson findPerson) {
        this.findPerson = findPerson;
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ServerResponse.ok().body(findPerson.execute(), Teacher.class);
    }
}
