package com.yywu.simple.runner;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableAsync;

//@Profile("local")  no work
@SpringBootApplication(scanBasePackages="com.yywu.simple")
@EnableAsync
@ImportResource("classpath:/META-INF/spring/dubbo/providers.xml")
public class ServiceApplication {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Test Spring-Boot starter");
		ConfigurableApplicationContext app = new SpringApplicationBuilder().sources(ServiceApplication.class).web(false).run(args);
		new CountDownLatch(1).await();
	}
}
