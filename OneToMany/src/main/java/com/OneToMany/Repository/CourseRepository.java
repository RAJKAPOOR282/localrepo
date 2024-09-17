package com.OneToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
