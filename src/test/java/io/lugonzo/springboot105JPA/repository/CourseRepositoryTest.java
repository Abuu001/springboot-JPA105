package io.lugonzo.springboot105JPA.repository;

import io.lugonzo.springboot105JPA.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void printCourses(){
        List<Course> courses = courseRepository.findAll();
        System.out.println("Courses " +courses);
    }

    @Test
    void findAllPagination(){
        Pageable firstPageWithThreeRecords = PageRequest.of(0,3, Sort.by("title"));
        Pageable secondPageWithTwoRecords = PageRequest.of(1,2);

        List<Course> courses1 = courseRepository.findAll(firstPageWithThreeRecords).getContent();
        System.out.println("courses 1 " +courses1);

        List<Course> courses2 = courseRepository.findAll(secondPageWithTwoRecords).getContent();
        System.out.println("courses 2 " +courses2);
    }
}