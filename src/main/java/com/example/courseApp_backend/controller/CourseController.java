package com.example.courseApp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
    @GetMapping("/view")
    public String ViewAll()
    {
        return "Courses List";
    }
}
