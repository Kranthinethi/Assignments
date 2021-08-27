package com.kranthi.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/index.html",method =RequestMethod.GET)
	public ModelAndView indexMethod() {
		ModelAndView model=new ModelAndView("index");
		return model;
	}
	
	
	@RequestMapping(value="/HelloWorld.html",method =RequestMethod.GET)
	public ModelAndView helloworldMethod() {
		ModelAndView model=new ModelAndView("helloWorld");
		model.addObject("msg","HELLO WORLD!");
		return model;
	}
}
