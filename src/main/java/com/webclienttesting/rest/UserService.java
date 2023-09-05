package com.webclienttesting.rest;

import lombok.Builder;
import org.apache.catalina.User;
import org.springframework.web.reactive.function.client.WebClient;

@org.springframework.stereotype.Service
@Builder
public class UserService {
    private final WebClient webClient;

    public UserService(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://placeholder.com/").build();
    }
    public User[] getUser() {
        return webClient
                .get()
                .uri("/users")
                .retrieve()
                .bodyToMono(User[].class).block();

    }
}
