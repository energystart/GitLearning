package com.simple.service;

import org.junit.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.simple.service.base.BaseTest;
import com.yywu.simple.service.ExService;
import com.yywu.simple.service.IExService;

@SpringBootApplication(scanBasePackages="com.yywu.simple")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = {ExServiceTest.class})
public class ExServiceTest extends BaseTest{

	@Test
	public void testSayHello(){
		IExService ex = new ExService();
		ex.sayHello("Hello World!!!");
	}
}
