package com.school.teacher.configuration;


import com.school.teacher.person.PersonHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;

@Configuration
public class RouterConfiguration {

    @Bean
    public RouterFunction<ServerResponse> route(PersonHandler personHandler) {
        return RouterFunctions.route()
                .path("/teacher-service", (core) -> core
                        .nest(
                                accept(APPLICATION_JSON),
                                route -> route
                                        .nest(path("person"), person -> person
                                                .GET("", personHandler::findAll)
                                                .GET("/{id}", personHandler::findTeacherById)
                                                .GET("/person", personHandler::findAll))
                        )
                ).build();

    }
}
