package com.train.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("appController")
public class AppController {
	private static final Logger logger = Logger.getLogger(AppController.class);
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		logger.debug("index debug");
		logger.warn("index");
		return model;
	}
	
	@RequestMapping("/contact")
	public ModelAndView admin() {
		ModelAndView model = new ModelAndView("contact");
		logger.warn("contact");
		return model;
	}
}
