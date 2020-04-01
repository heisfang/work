package com.student.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.student.entity.Teacher;
import com.student.service.LoginService;
import com.student.service.StudentService;



@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password,Model model,HttpSession session) {
		if(username==null||password==null) {
			System.out.println("用户名或密码不能为空");
			return "erre";
		}
		
		Teacher teacher = loginService.login(username,password);
		if(teacher == null) {
			return "erre";
		}else {
			model.addAttribute("teacher", teacher);
			System.out.println("登录成功");
			session.setAttribute("LOGIN_SESSION", teacher);
		}
		return "redirect:stuAll";	//重定向到 userlist请求
	}
	
	@RequestMapping(value="/login-out",method=RequestMethod.GET)
	public String login_out(HttpSession session) {
		session.setAttribute("LOGIN_SESSION", null);
		return "erre";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(String username,String password,Model model) {
		Teacher teacher = new Teacher();
		teacher.setPassword(password);
		teacher.setUserName(username);
		model.addAttribute("teacher", teacher);
		int row = loginService.insertTeacher(teacher);
		System.out.println("==="+row);
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
