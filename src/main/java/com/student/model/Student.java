package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//orm-> object relation mapping
@Entity
public class Student {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int age;
	private String department;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long id, String name, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
