	package com.ishfaaq.sms.service;
	
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishfaaq.sms.model.Student;
	import com.ishfaaq.sms.repository.HibernateStudentRepositoryimpl;
	import com.ishfaaq.sms.repository.StudentRepository;
	
	@Service("StudentService")
	public class StudentServiceimpl implements StudentService {
		
		// tight coupling 
		@Autowired
		StudentRepository studentrepository; //= new HibernateStudentRepositoryimpl();
		
		public StudentServiceimpl() {
			System.out.println("Default constructoer fired");
		}
		
		public StudentServiceimpl(StudentRepository repository) {
			System.out.println("constructoer fired");
			this.studentrepository = repository;
		}
		
		
		public StudentRepository getStudentRepository() {
			return studentrepository;
		}
	
		
		public void setStudentRepository(StudentRepository repository) {
			System.out.println("Setter Fiered");
			this.studentrepository = repository;
		}
	
	
		public List<Student> fetchAllStudents(){
			return studentrepository.fetchAllStudents();
		}
	
	}
