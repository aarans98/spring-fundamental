package com.example.backend_101.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping(value = "/hello-world")
    public String getHelloWorld() {
        return "Hello World";
    }

}
