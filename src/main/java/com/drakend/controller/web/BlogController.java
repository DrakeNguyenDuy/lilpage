package com.drakend.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.drakend.model.BlogModel;

@Controller(value = "blogControllerWeb")
public class BlogController {
	@RequestMapping(value = { "/blogs" }, method = { RequestMethod.GET })
	public ModelAndView blogs(@ModelAttribute("model") BlogModel blogModel) {
		ModelAndView modelAndView = new ModelAndView("blogs");
		modelAndView.addObject("model", blogModel);
		return modelAndView;
	}
}
