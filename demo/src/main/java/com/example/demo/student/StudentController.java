package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")// provides routing information /
    public String hello(){
        return "Hello Spring Boot Demo Application!!";
    }

}
