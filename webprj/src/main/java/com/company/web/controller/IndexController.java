package com.company.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	/*
	 * dispatcher-servlet.xml에서 정의한 페이지 요청에 응답하는 함수를 작성한다
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("IndexController");
		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("data", "Hello Spring MVC");
//		mv.setViewName("/WEB-INF/view/index.jsp"); // 루트에 있던 index.jsp를 숨기고 controller에서만 호출 되도록 한다

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("data", "Hello Spring MVC");
		

		return mv;
	}

}
