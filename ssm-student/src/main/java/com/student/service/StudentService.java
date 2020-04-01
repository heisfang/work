package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentMapper;
import com.student.entity.Student;

@Service("studentService")
public class StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		return studentMapper.getAllStu();
	}

	public float getMaxScore() {
		// TODO Auto-generated method stub
		return studentMapper.getMaxScore();
	}

}
