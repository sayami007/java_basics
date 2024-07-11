package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringApplication.class)) {
        }
    }
}
