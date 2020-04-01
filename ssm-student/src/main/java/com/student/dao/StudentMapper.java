package com.student.dao;

import java.util.List;

import com.student.entity.Student;

public interface StudentMapper {

	List<Student> getAllStu();

	float getMaxScore();
	
}
