package com.school.teacher.person;

import com.school.teacher.person.model.Teacher;
import com.school.teacher.person.usecase.FindPeople;
import com.school.teacher.person.usecase.FindPersonById;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PersonHandler {

    private static final Log log = LogFactory.getLog(PersonHandler.class);

    private final FindPeople findPeople;


    private final FindPersonById findPersonById;

    PersonHandler(FindPeople findPeople, FindPersonById findPersonById) {
        this.findPeople = findPeople;
        this.findPersonById = findPersonById;
    }

    public Mono<ServerResponse> findTeacherById(ServerRequest request) {
        int id = Integer.parseInt(request.pathVariable("id"));
        return ServerResponse.ok().body(findPersonById.execute(id), Teacher.class);
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ServerResponse.ok().body(findPeople.execute(), Teacher.class);
    }
}
