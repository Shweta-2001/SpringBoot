package com.student.service;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Service;

import com.student.model.Student;


public interface StudentService extends JpaRepository<Student,Long> {

}
