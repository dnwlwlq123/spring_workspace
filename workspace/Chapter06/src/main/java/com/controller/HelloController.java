package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", "Hello Spring MVC!!");
		//mav.setViewName("hello");//JSP의 파일명 => /view/hello.jsp
		mav.setViewName("/view/hello");
		return mav;
	}
	
	//스프링에서 리턴 타입이 String이면 단순 문자열이 아니라 JSP의 파일명으로 인식한다. 
	//=> /WEB-INFwelcom.jsp를 찾는다
	//만약에 단순 문자열로 처리하고 싶을 때는 @ResponseBody를 쓰면 된다.
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET, produces="text/html; charset=UTF-8")
	@ResponseBody
	public String hello2() {
		//return "welcome";
		return "안녕하세요";
	}
}
