package com.in28minutes.learn_spring_framework.course.springDataJPA;

import com.in28minutes.learn_spring_framework.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJPARepository extends JpaRepository<Course, Long> {

    List<Course> findByIdAndAuthor(Long id, String author);

}
