package com.school.student.person;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PersonHandler {

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ServerResponse.ok().body(Mono.just("Hello World!"), String.class);
    }
}
