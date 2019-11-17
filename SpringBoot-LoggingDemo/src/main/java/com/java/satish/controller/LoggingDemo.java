package com.java.satish.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingDemo {
	
	Logger logger=LoggerFactory.getLogger(LoggingDemo.class);
	@RequestMapping("/")
	public String loggingDemo()
	{
		logger.trace("This is an error");
		return "This is logging Demo";
	}

}
