package com.ishfaaq.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ishfaaq.sms.model.Student;
import com.ishfaaq.sms.service.StudentService;
import com.ishfaaq.sms.service.StudentServiceimpl;

@Configuration
@ComponentScan("com.ishfaaq.sms")
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationCotext =
				new AnnotationConfigApplicationContext(Application.class);
		//new ClassPathXmlApplicationContext("applicationContext.xml");
		//StudentService service = new StudentServiceimpl();
		
		
		StudentService service = applicationCotext.getBean("StudentService", StudentService.class);
		List<Student> students = service.fetchAllStudents();
		
		for(Student student : students) {
			System.out.println("name is "+ student.getName() + " college is " + student.getCollege() );
		}
		

	}

}
