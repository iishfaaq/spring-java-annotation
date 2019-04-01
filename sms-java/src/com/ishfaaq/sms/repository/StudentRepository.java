package com.ishfaaq.sms.repository;

import java.util.ArrayList;
import java.util.List;

import com.ishfaaq.sms.model.Student;

public interface StudentRepository {
	
	public List<Student> fetchAllStudents();

}
