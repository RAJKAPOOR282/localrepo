package com.OneToMany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OneToMany.Repository.CourseRepository;
import com.OneToMany.entity.Course;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/getCourses")
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
}
