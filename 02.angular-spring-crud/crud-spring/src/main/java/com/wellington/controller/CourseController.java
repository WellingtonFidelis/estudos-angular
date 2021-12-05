package com.wellington.controller;

import com.wellington.model.Course;
import com.wellington.repository.CourseRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

  private final CourseRepository courseRepository;
  
  /* public CourseController(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  } */

  //@RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public List<Course> list() {
    return courseRepository.findAll();
  }
}
