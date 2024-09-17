package com.OneToMany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OneToMany.Service.FacultyService;
import com.OneToMany.entity.Faculty;

@RestController
@RequestMapping("/")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("/getFaculty")
    public List<Faculty> getFaculties() {
        return facultyService.getAllFaculties();
    }

    @PostMapping("/saveFaculty")
    public Faculty saveFaculty(@RequestBody Faculty faculty) {
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/getFaculty/{id}")
    public Faculty getFacultyById(@PathVariable Long id) {
        return facultyService.getFacultyById(id);
    }

    @DeleteMapping("/deleteFaculty/{id}")
    public void deleteFaculty(@PathVariable Long id) {
        facultyService.deleteFaculty(id);
    }
}