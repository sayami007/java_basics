package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Krishna";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        return new Person("Sudhir", 20, new Address("sdf", "sdf"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Berkley", "Kathmandu");
    }
}
