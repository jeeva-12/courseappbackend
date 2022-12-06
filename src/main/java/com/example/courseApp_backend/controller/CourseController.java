package com.example.courseApp_backend.controller;


import com.example.courseApp_backend.model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
    @GetMapping("/view")
    public String ViewAll()
    {
        return "Courses List";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c)
    {
        System.out.println(c.getCourseTittle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        return "Course added Successfully";
    }
}
