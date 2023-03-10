package com.drakend.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerWeb")
public class HomeController {
	@RequestMapping(value = { "/home" }, method = { RequestMethod.GET })
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView("web/home");
		return modelAndView;
	}
	@RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
	public ModelAndView loginPage() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
}
