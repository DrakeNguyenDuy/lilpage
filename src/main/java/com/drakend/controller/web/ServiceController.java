package com.drakend.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.drakend.model.ServiceModel;

@Controller(value = "serviceController")
public class ServiceController {
	@RequestMapping(value = "/service", method= {RequestMethod.GET})
	public ModelAndView service(@ModelAttribute("model") ServiceModel serviceModel) {
		ModelAndView modelAndView = new ModelAndView("service");
		modelAndView.addObject("model-service", serviceModel);
		return modelAndView;
	}
}
