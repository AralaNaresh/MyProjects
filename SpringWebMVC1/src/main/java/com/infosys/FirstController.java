package com.infosys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

	@RequestMapping(path = "/one")
	public void methodOne() {
		System.out.println("  server hello nana");

		
	}
	

}
