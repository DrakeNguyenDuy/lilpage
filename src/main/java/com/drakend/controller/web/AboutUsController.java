package com.drakend.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.drakend.model.UserModel;

@Controller(value = "aboutUsController")
public class AboutUsController {
@RequestMapping(value = "/about-us", method = {RequestMethod.GET})
public ModelAndView aboutUs(@ModelAttribute("model") UserModel userModel) {
	ModelAndView modelAndView = new ModelAndView("about-us");
	modelAndView.addObject("model", userModel);
	return modelAndView;
}
}
