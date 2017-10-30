package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.LabelLibrary;
import com.service.LabelService;

@Controller
@RequestMapping("test")
public class TestController {
	@Resource
	private LabelService labelService;
	
	@RequestMapping("getUserInfo")
	public ModelAndView getUserInfo(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		LabelLibrary label = labelService.getLabelInfo(64);
		mav.addObject("name", label.getLabelName());
		mav.setViewName("page/test");
		return mav;
	}
	
}
