package com.javaGG.spring_12_1_ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	@RequestMapping(value = "/view")
	public String view() {
		return "view";
	}
	
}
