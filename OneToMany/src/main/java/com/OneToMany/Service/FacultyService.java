package com.OneToMany.Service;

import java.util.List;

import com.OneToMany.entity.Faculty;

public interface FacultyService {
    List<Faculty> getAllFaculties();
    Faculty saveFaculty(Faculty faculty);
    Faculty getFacultyById(Long id);
    void deleteFaculty(Long id);
}
