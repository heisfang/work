package com.student.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.student.entity.Teacher;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		
		Teacher teacher = (Teacher)session.getAttribute("LOGIN_SESSION");
		if(null == teacher) {
			response.sendRedirect(request.getContextPath()+"/pages/erre.jsp");
			return false;
		}
		return true;
	}

}
