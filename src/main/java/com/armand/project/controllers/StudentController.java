package com.armand.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armand.project.exceptions.ResourceNotFound;
import com.armand.project.models.Student;
import com.armand.project.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) {
	  Student student = studentRepo.findById(id).orElseThrow(() -> new
	  ResourceNotFound("Student with given id not found.Given Id: " + id));
	  return ResponseEntity.ok(student); 
	  }
	 
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student updatedStudentInfo){
		Student student = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFound("Student with given id not found.Given Id: " + id));
		student.setSname(updatedStudentInfo.getSname());
		student.setSsurname(updatedStudentInfo.getSsurname());
		student.setSemail(updatedStudentInfo.getSemail());
		Student updatedStudent = studentRepo.save(student);
		return ResponseEntity.ok(updatedStudent);
		
	}
}