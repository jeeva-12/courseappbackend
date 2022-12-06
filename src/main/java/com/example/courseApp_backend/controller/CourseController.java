package com.example.courseApp_backend.controller;


import com.example.courseApp_backend.dao.CourseDao;
import com.example.courseApp_backend.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController
{
    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c)
    {
        System.out.println(c.getCourseTittle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "Course added Successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Courses> ViewAll()
    {
        return (List<Courses>) dao.findAll();
    }

}
