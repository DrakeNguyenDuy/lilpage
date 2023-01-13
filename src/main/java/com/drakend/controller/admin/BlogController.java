package com.drakend.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.drakend.model.BlogModel;
import com.drakend.service.impl.BlogService;

@Controller(value = "blogControllerAdmin")

public class BlogController {
	@Autowired
	private BlogService blogService;

	@RequestMapping(value = "/admin-blog", method = { RequestMethod.GET })
	public ModelAndView getBlogs(@ModelAttribute("m") BlogModel blogModel) {
		ModelAndView modelAndView = new ModelAndView("admin/blog");
		List<BlogModel> models= blogService.findAll();
		blogModel.setListResult(models);
		modelAndView.addObject("model", blogModel);
		return modelAndView;
	}
}
