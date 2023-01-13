package com.drakend.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.drakend.model.BlogModel;

@Controller(value = "homeControllerAdmin")
public class HomeAdminController {

	@RequestMapping(value = {"/admin-home"}, method= {RequestMethod.GET})
	public ModelAndView getHome(@ModelAttribute("model") BlogModel blogModel) {
		ModelAndView modelAndView = new ModelAndView("admin/home");
		return modelAndView;
	}
}
