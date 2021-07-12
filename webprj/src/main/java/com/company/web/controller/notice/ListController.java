package com.company.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * notice.list로 tiles.xml에서 사이트 구성을 호출하게된다
		 */
//		ModelAndView mv = new ModelAndView("notice/list");
		ModelAndView mv = new ModelAndView("notice.list");
		
		return mv;
	}

}
