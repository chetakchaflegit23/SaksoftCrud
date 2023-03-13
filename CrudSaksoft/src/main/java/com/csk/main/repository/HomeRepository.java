package com.csk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csk.main.model.Student;

@Repository
public interface HomeRepository extends JpaRepository<Student, Integer>
{

}
