package io.lugonzo.springboot105JPA.repository;

import io.lugonzo.springboot105JPA.entity.Guardian;
import io.lugonzo.springboot105JPA.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void insertStudent() {
        var guardian1 = Guardian.builder()
                .name("Dosh")
                .email("dosh@gmail.com")
                .mobile("0735232872")
                .build();

        var student1 =Student.builder()
                .emailId("abu@gmail.com")
                .firstName("abu")
                .lastName("001")
                .guardian(guardian1)
                .build();
        Student student =studentRepository.save(student1);

        System.out.println("Added student : >>>>>>" + student);
    }


    @Test
    void findByFirstName() {
        List<Student> students =studentRepository.findByFirstName("abu");
        System.out.println(students);
    }

    @Test
    void printStudentBasedOnGuardianName() {
        List<Student> students =studentRepository.findByGuardianName("Dosh");
        System.out.println("Guardian name >>>" + students);
    }

    @Test
    void printStudentByEmailAddreee() {
        Student students =studentRepository.getStudentByEmailAddress("abu@gmail.com");
        System.out.println("Student by email address >>>" + students);
    }

    @Test
    void printgetStudentByEmailAddressNativeNamedParam(){
            Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("abu@gmail.com");

        System.out.println("#### ==" + student);
    }

    @Test
    void updateStudentNameByEmailId(){
        studentRepository.updateStudentNameByEmailId("Lugonzo","abu@gmail.com");
    }
}