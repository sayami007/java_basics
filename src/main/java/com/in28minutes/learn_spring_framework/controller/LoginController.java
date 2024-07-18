package com.in28minutes.learn_spring_framework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap model) {
        logger.info("Info Level Logs.");
        model.put("name", name);
        return "login";
    }
}
