package com.company.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DetailController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * notice.detail로 tiles.xml에서 사이트 구성을 호출하게된다
		 */
//		ModelAndView mv = new ModelAndView("notice/detail");
		ModelAndView mv = new ModelAndView("notice.detail");
		
		return mv;
	}

}
