package com.in28minutes.learn_spring_framework.course.jdbc;

import com.in28minutes.learn_spring_framework.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            insert into course(id,name,author) 
            values(?,?,?);
    """;
    private static String DELETE_QUERY = """
                   delete from course 
                      where id = ?;
            """;
    private static String SELECT_QUERY = """
                   SELECT * FROM Course WHERE id = ?;
            """;

    public void insert(Course course) {
        this.springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(int id) {
        this.springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findByID(long id) {
        return this.springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
