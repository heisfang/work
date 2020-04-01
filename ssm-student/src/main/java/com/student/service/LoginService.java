package com.student.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.TeacherMapper;
import com.student.entity.Teacher;

@Service("loginService")
public class LoginService {
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	public Teacher login(String username, String password) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherMapper.login(username, password);
		return teacher;
	}

	public int insertTeacher(Teacher teacher) {
		
		int x;//定义两变量
        Random ne=new Random();//实例化一个random的对象ne
        x=ne.nextInt(9999-1000+1)+1000;//为变量赋随机值1000-9999
       
		teacher.setId(x);
		return teacherMapper.insertTeacher(teacher);
	}

}














