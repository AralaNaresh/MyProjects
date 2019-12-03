package com.inetsolv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	@RequestMapping(path = "/two")
	public void  oneMeythod() {

		System.out.println("welcome naresh jessy");
		//return "one.jsp";
	}

}
