package io.lugonzo.springboot105JPA.repository;

import io.lugonzo.springboot105JPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
