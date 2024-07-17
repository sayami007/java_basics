package com.in28minutes.learn_spring_framework.course.jpa;

import com.in28minutes.learn_spring_framework.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.find(Course.class, id));
    }

    public Course findByID(long id) {
        return entityManager.find(Course.class, id);
    }
}
