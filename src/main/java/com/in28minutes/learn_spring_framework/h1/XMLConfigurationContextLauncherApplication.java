package com.in28minutes.learn_spring_framework.h1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class XMLConfigurationContextLauncherApplication {


    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(XMLConfigurationContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
