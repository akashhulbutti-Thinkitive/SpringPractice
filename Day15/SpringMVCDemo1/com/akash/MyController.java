package com.akash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String myPage() {
		System.out.println("My COntroller Called");
		return "welcome.jsp";
	}

}
