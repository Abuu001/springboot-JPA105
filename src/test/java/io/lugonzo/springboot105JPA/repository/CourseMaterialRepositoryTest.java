package io.lugonzo.springboot105JPA.repository;

import io.lugonzo.springboot105JPA.entity.Course;
import io.lugonzo.springboot105JPA.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    CourseMaterialRepository courseMaterialRepository;

    @Test
    void saveCourseMaterial(){
        Course course = Course.builder()
                .credit(5)
                .title("Maths")
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }

/*    @Test
    void printAllCourseMaterials(){
        List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();
        System.out.println("Course materials " + courseMaterials); //[CourseMaterial(courseMaterialId=2, url=www.google.com)]
    }*/


}