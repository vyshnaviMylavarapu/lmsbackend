package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface CourseInterface extends JpaRepository<Courses, String>{
public Courses findByCoursecode(String coursecode);
}