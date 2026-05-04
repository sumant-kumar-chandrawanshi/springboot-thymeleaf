package com.panther.springboot_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
