package com.yywu.simple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yywu.simple.service.IExService;

@Controller
@RequestMapping("/hello")
public class HelloController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private IExService exService;
	
	@RequestMapping("/say.htm")
	public void sayHello(String name){
		exService.sayHello(name);
	}
}
