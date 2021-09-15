package io.lugonzo.springboot105JPA.repository;

import io.lugonzo.springboot105JPA.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
