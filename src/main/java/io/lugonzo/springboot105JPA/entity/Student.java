package io.lugonzo.springboot105JPA.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailid_unique",
                columnNames = "email_address"
        )
)
public class Student {

    @Id
    @GeneratedValue(generator = "student_sequence",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(name = "email_address"  ,nullable = false)
    private String emailId;

    @Embedded
    private Guardian guardian;

}
