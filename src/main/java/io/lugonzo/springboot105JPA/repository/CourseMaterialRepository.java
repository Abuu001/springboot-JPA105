package io.lugonzo.springboot105JPA.repository;

import io.lugonzo.springboot105JPA.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {

}
