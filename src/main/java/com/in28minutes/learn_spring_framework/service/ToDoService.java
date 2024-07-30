package com.in28minutes.learn_spring_framework.service;

import com.in28minutes.learn_spring_framework.entity.ToDo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private static List<ToDo> todos;

    private static int todosCount = 0;

    static {
        todos = new ArrayList<ToDo>();
        todos.add(new ToDo(++todosCount, "b_base", "Test 1", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(++todosCount, "b_base", "Test 2", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(++todosCount, "b_base", "Test 3", LocalDate.now().plusYears(1), false));
    }

    public List<ToDo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        ToDo toDo = new ToDo(++todosCount, username, description, targetDate, done);
        todos.add(toDo);
    }
}
