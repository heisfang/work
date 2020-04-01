package com.student.dao;

import com.student.entity.Teacher;

public interface TeacherMapper {
	
	Teacher login(String username,String password);

	int insertTeacher(Teacher teacher);

}
