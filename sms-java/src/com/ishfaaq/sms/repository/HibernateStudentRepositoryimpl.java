package com.ishfaaq.sms.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ishfaaq.sms.model.Student;

@Repository
public class HibernateStudentRepositoryimpl implements StudentRepository {
	
	public List<Student> fetchAllStudents(){
		List<Student> students = new ArrayList<>();
		
		Student student = new Student();
		student.setName("Krishantha");
		student.setCollege("Richmond");
		
		Student student2 = new Student();
		student2.setName("Ishfaaq");
		student2.setCollege("Zahira");
		
		students.add(student);
		students.add(student2);
		
		return students;
	}

}
