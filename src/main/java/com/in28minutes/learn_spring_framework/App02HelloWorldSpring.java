package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: Configure the things that we want Spring to name
        // HelloWorldConfiguration = @Configuration
        // name = @Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));

        Arrays.stream(context.getBeanDefinitionNames()
        ).forEach(System.out::println);
    }
}
