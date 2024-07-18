package com.in28minutes.learn_spring_framework.controller;


import com.in28minutes.learn_spring_framework.entity.ToDo;
import com.in28minutes.learn_spring_framework.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;


@Controller
@SessionAttributes("name")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @RequestMapping("/list-todos")
    public String todoList(ModelMap model) {
        List<ToDo> toDoList = toDoService.findByUsername("Test");
        model.addAttribute("todos", toDoList);
        return "listTodos";
    }

}
