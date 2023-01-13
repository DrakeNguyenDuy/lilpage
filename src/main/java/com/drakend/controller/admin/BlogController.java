package com.drakend.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "blogControllerAdmin")
public class BlogController {

	@RequestMapping(value = "/admin-blog", method= {RequestMethod.GET})
	public ModelAndView getBlogs() {
		ModelAndView modelAndView = new ModelAndView("admin/blog");
		return modelAndView;
	}
}
