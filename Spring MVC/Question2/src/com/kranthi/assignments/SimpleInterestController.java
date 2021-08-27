package com.kranthi.assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {

	@RequestMapping(value="/SimpleInterest.html",method = RequestMethod.GET)
	public ModelAndView simpleInterest() {
		ModelAndView model=new ModelAndView("SimpleInterest");
		return model;
	}
	
	@RequestMapping(value="/result.html",method = RequestMethod.POST)
	public ModelAndView result(@RequestParam("principleAmount") double p,@RequestParam("years") int t,@RequestParam("rateOfInterest") int r) {
		
		double result=(double)((p*t)*r)/100;
		ModelAndView model=new ModelAndView("result");
		model.addObject("result","SimpleInterest is: "+result);
		model.addObject("p",p);
		model.addObject("r",r);
		model.addObject("t",t);
		return model;
	}

}
