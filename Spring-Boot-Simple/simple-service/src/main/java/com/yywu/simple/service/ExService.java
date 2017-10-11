package com.yywu.simple.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 入门学习用例
 * @author YY
 *
 */
@Service("exService")
public class ExService implements IExService {

	@Value("${message.data.name}")
	private String name;
	
	public String sayHello(String hello) {
		System.out.println("ExService.sayHello:"+hello);
		System.out.println(name);//
		return hello;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName()	{
		return name;
	}
}
