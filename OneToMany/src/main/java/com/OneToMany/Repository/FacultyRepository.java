package com.OneToMany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OneToMany.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}