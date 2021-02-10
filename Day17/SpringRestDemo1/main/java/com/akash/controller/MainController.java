package com.akash.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akash.models.Student;

@RestController
public class MainController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String returnHome() {
		return "hello World";
	}
	
	@RequestMapping(value = "/single",method = RequestMethod.GET)
	public Student getSingleRecord() {
		return new Student(124,"John Doe2",7);
	}
	
	
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public List<Student> getAllRecords() {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(123,"John Doe1",6));
		list.add(new Student(124,"John Doe2",7));
		list.add(new Student(125,"John Doe3",8));
		return list;
	}
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public Student getStudentRecords(@RequestBody Student stud) {
		System.out.println(stud);
		return stud;
	}
	
	@RequestMapping(value = "/put",method = RequestMethod.PUT)
	public Student putMethod(@RequestBody Student stud) {
		System.out.println(stud);
		return stud;
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public Student deleteMethod(@RequestBody Student stud) {
		System.out.println(stud);
		return stud;
	}
	
	@PostMapping(value = "/path/{id}")
	public String getPathVariable(@PathVariable("id") Integer id) {
		System.out.println("Id is : "+id);
		return "Got Value : "+id;
	}
	
}
