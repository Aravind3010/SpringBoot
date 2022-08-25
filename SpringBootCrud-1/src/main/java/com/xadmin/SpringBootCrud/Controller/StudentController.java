package com.xadmin.SpringBootCrud.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xadmin.SpringBootCrud.Domain.Student;
import com.xadmin.SpringBootCrud.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@RequestMapping("/students")
	public List<Student> getAllStudent() {
		return studentservice.getAllStudents();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
	}


	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		studentservice.deleteStudent(id);
	}
}
