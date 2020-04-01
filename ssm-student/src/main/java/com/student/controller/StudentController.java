package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.student.entity.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/stuAll",method=RequestMethod.GET)
	public String getStuAll(Model model) {
		System.out.println("jeowfieowi");
		List<Student> list = studentService.getAllStudent();
		model.addAttribute("list", list);
		return "index";
	}

	
	@RequestMapping(value="/maxscore",method=RequestMethod.GET)
	public String getMaxScore(Model model) {
		float max = studentService.getMaxScore();
		model.addAttribute("max", max);
		System.out.println("max:"+max);
		return "index";
	}

}
