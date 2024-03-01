package com.cisco.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	@GetMapping("/headline")
	@ResponseBody
	public String getLatestBusinessNewsHeadline() {
		return "Starlight, star bright: Coca-Cola introduces a 1st-of-its-kind flavor, inspired by space - KSL.com";
	}

}