package com.xadmin.SpringBootCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xadmin.SpringBootCrud.Domain.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}