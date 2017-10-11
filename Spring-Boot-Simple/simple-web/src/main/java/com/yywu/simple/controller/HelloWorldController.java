package com.yywu.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
    public String helloWorld(){
		System.out.println("hello world");
        return "helloWorld.html";
    }
}
