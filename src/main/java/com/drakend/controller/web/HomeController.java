package com.drakend.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerWeb")
public class HomeController {
	@RequestMapping(value = { "/home" }, method = { RequestMethod.GET })
	public ModelAndView homePage() {
		System.out.println("co do day khogn");
		ModelAndView modelAndView = new ModelAndView("web/home");
		return modelAndView;
	}
}
