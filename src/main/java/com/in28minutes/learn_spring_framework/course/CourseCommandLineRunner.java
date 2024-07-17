package com.in28minutes.learn_spring_framework.course;

import com.in28minutes.learn_spring_framework.course.jpa.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJPARepository courseRepository;

//    @Autowired
//    private CourseJDBCRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
        courseRepository.insert(new Course(1, "Learn Programming ", "Bibesh sayami"));
        courseRepository.insert(new Course(2, "Learn Chinese ", "Lee Shan"));
        courseRepository.insert(new Course(3, "Learn Japanese ", "Yuan Uh"));
        courseRepository.delete(2);
        Course course1 = courseRepository.findByID(1);
        Course course3 = courseRepository.findByID(3);
        System.out.println(course1.getName());
        System.out.println(course3.getName());
    }
}
