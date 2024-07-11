package com.in28minutes.learn_spring_framework.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("3 Some Logic using some dependency");
    }
}

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("1 All Dependency are ready");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("2 Initializing SomeClass");
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("4 Destroying SomeClass");
    }
}


@Configuration
@ComponentScan
public class PrePostAnnotationContextApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextApplication.class)) {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
