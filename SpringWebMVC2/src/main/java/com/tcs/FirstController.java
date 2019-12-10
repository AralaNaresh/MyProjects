package com.tcs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

	@RequestMapping(path = "/emp", method = RequestMethod.GET)
	public String metghoOne() {
		System.out.println("server");
		
		return "one.jsp";

	}

	@RequestMapping(path = "/emp", method = RequestMethod.POST)
	public String metghTwo() {
		System.out.println("eno");
		return "two.jsp";

		
		
		
		
		
	}


}
