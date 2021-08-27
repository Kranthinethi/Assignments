package com.kranthi.assignments;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value = "/login.html",method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model=new ModelAndView("login");
		return  model;
	}
	
	@ModelAttribute
	public void addingCommanObjects(Model model1)
	{
	    
	    model1.addAttribute("msg","UserLogin");
	}

		
		
	@RequestMapping(value = "/Authenticate.html",method=RequestMethod.POST)
	public ModelAndView check(@ModelAttribute("user") UserModelClass user) {
		UserModelClass user1=new UserModelClass();
		user1.setUsername("kranthi");
		user1.setPassword("123");
		user1.setEmail("abc@gmail.com");
		if(user.getUsername().equals(user1.getUsername()) && user.getPassword().equals(user1.getPassword()))
		{
			ModelAndView model=new ModelAndView("success");
			model.addObject(user);
			return  model;
		}
		else
		{
			ModelAndView model=new ModelAndView("error");
			model.addObject(user);
			return  model;
		}
			
		
	}
}
