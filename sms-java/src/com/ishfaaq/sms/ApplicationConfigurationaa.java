package com.ishfaaq.sms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ishfaaq.sms.repository.HibernateStudentRepositoryimpl;
import com.ishfaaq.sms.repository.StudentRepository;
import com.ishfaaq.sms.service.StudentService;
import com.ishfaaq.sms.service.StudentServiceimpl;

@Configuration
@ComponentScan("com.ishfaaq.sms")
public class ApplicationConfigurationaa {
	
//	@Bean(name="studentService")
//	public StudentService getStudentService() {
//		//return new StudentServiceimpl();
//		StudentServiceimpl service = new StudentServiceimpl();
//		service.setStudentRepository(getStudentRepository());
//		return service;
//	}
	
//	@Bean(name="studentService")
//	public StudentService getStudentService() {
//		
//		return new StudentServiceimpl();
//	}
//	
//	@Bean(name="studentRepository")
//	public StudentRepository getStudentRepository() {
//		return new HibernateStudentRepositoryimpl();
//	}

}
