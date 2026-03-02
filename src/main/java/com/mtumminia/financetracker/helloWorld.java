package com.mtumminia.financetracker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping("/hello")
    public String welcome() {
        return "Hello World!";
    }
}
