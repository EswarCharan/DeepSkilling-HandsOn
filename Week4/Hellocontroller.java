package com.cognizant.spring_learn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Hellocontroller {

	private static final Logger LOGGER=LoggerFactory.getLogger(Hellocontroller.class);
	
	@GetMapping("/hello")
	public String sayHello() {
		LOGGER.info("Start: sayHello()");
		String message="Helloworld";
		LOGGER.info("End: sayHello()");
		return message;
	}
}
