package com.example.courseApp_backend.dao;

import com.example.courseApp_backend.model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Courses,Integer>  {
}
