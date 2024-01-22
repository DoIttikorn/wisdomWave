package com.school.teacher.configuration;


import com.school.teacher.person.PersonHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class RouterConfiguration {

    @Bean
    public RouterFunction<ServerResponse> route(PersonHandler personHandler) {
        return RouterFunctions
                .route(GET("/person"), personHandler::findAll);
    }
}
