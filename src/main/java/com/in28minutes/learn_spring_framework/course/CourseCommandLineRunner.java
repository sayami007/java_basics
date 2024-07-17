package com.in28minutes.learn_spring_framework.course;

import com.in28minutes.learn_spring_framework.course.jpa.CourseJPARepository;
import com.in28minutes.learn_spring_framework.course.springDataJPA.CourseSpringJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringJPARepository courseRepository;


//    @Autowired
//    private CourseJPARepository courseRepository;

//    @Autowired
//    private CourseJDBCRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
        courseRepository.save(new Course(1, "Learn Programming ", "Bibesh sayami"));
        courseRepository.save(new Course(2, "Learn Chinese ", "Lee Shan"));
        courseRepository.save(new Course(3, "Learn Japanese ", "Yuan Uh"));
        courseRepository.deleteById(2l);
        System.out.println(courseRepository.findAll());
        System.out.println(courseRepository.findByIdAndAuthor(1l,"Bibesh sayami").get(0).getAuthor());
    }
}
