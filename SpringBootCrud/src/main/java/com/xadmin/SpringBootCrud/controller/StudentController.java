package com.xadmin.SpringBootCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.service.StudentService;

import antlr.collections.List;

@RestController
public class StudentController {
	@Autowired
private StudentService studentservice;
	
	@RequestMapping("/students");
	public List getAllStudent()
	{
		return studentservice.getAllStudent();
	}
}
