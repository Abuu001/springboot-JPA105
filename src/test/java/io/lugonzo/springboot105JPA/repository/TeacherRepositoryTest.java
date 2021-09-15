package io.lugonzo.springboot105JPA.repository;

import io.lugonzo.springboot105JPA.entity.Course;
import io.lugonzo.springboot105JPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository repository;

    @Test
    void saveTeacher(){
        Course course1 = Course.builder()
                .title("Accounts")
                .credit(2)
                .build();

        Course course2 = Course.builder()
                .title("BBIT")
                .credit(9)
                .build();

        List<Course> courses =List.of(course1,course2);

        Teacher teacher = Teacher.builder()
                .firstName("Martha")
                .lastName("keira")
                .courses(courses)
                .build();

        repository.save(teacher);
    }
}