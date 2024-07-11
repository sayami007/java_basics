package com.in28minutes.learn_spring_framework;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in 28 Minutes"),
                new Course(2, "Learn Devops", "in 28 Minutes"),
                new Course(3, "Learn Azure", "in 28 Minutes"),
                new Course(4, "Learn UI", "in 28 Minutes")
        );
    }
}
