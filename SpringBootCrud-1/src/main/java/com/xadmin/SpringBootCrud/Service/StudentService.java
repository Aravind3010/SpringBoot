package com.xadmin.SpringBootCrud.Service;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.Domain.Student;
import com.xadmin.SpringBootCrud.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepo;

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepo.findAll().forEach(students::add);
		return students;
	}

	public void addStudent(Student student) {
		studentRepo.save(student);
	}


	public void deleteStudent(Integer id) {
		studentRepo.deleteById(id);
	}
}
