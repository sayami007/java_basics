package com.in28minutes.learn_spring_framework.course.jdbc;

import com.in28minutes.learn_spring_framework.course.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(CourseJDBCCommandLineRunner.class);
    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert(new Course(1, "Learn Programming ", "Bibesh sayami"));
        courseJDBCRepository.insert(new Course(2, "Learn Chinese ", "Bibesh sayami"));
        courseJDBCRepository.insert(new Course(3, "Learn Japanese ", "Bibesh sayami"));
        courseJDBCRepository.delete(2);
        Course course = courseJDBCRepository.findByID(3);
        System.out.println(course);
    }
}
