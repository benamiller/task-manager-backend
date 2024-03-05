package com.tortellini.taskmanagerbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/helloworld")
    public String helloWorld() {
        int testVariable = 10;
        System.out.println(testVariable);
        return "Hello World";
    }

    @GetMapping("/secondTest")
    public String secondTest() {
        return "Second Test";
    }
}
