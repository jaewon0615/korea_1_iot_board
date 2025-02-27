package com.korit.board_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class BoardBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardBackApplication.class, args);
    }
    // WebClient 빈 등록
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

}
