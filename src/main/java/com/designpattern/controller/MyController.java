package com.designpattern.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This my Controller
@RestController
public class MyController {
	
	@RequestMapping(path="/designPatternsImplemented",produces= MediaType.APPLICATION_JSON_VALUE)
	public String designPatternsImplemented() {
		
		return "Now not Implemented";
	}
	
}
