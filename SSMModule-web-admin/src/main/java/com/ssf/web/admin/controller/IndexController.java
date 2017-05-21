package com.ssf.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	
	
	private static final String VIEW_PATH = "";
	
	@RequestMapping("")
	public String index(){
		return VIEW_PATH+"home";
	}
	
	@RequestMapping("/home")
	public String home(){
		return VIEW_PATH+"home";
	}
	
	
	@RequestMapping("/path/{path}")
	public String test(@PathVariable("path")String path){
		return VIEW_PATH+path;
	}

}
