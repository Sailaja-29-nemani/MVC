package com.sopra.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Person
{
	@RequestMapping("/Sailaja")
	public String home()
	{
		return "index";
	}
	@RequestMapping("/org")
	public String org()
	{
		return "org";
	}
}
