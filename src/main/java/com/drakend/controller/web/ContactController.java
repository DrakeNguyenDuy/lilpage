package com.drakend.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "contactController")
public class ContactController {
	@RequestMapping(value = "/contact", method = {RequestMethod.GET})
	public ModelAndView contact(@ModelAttribute("model") ContactController contactController) {
		ModelAndView modelAndView = new ModelAndView("contact");
		modelAndView.addObject("model-contact", contactController);
		return modelAndView;
	}
}
