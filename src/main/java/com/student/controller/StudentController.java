package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.StudentService;
import com.student.model.Student;

@RestController
@RequestMapping("/emp")
public class StudentController {
	@Autowired
	private StudentService emp;
	//Get(read),Post(create/add),Put(update),Delete
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getAll()	
	{
		return ResponseEntity.ok(emp.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getAllById(@PathVariable Long id)	
	{
		return ResponseEntity.ok(emp.findById((long) id).orElse(null));
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> addAll(@RequestBody Student student)
	{
		return ResponseEntity.ok(emp.save(student));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateAll(@RequestBody Student student)
	{
		return ResponseEntity.ok(emp.save(student));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Student> delete(@PathVariable Long id)	
	{
		emp.findById((long) id).ifPresent(emp::delete);
		return ResponseEntity.ok().build();
	}

}
