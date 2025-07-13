package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private final static Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {

		 ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.debug("ApplicationContext initialized with {} beans", context.getBeanDefinitionCount());
		LOGGER.info("SpringLearnApplication started successfully!");
		 testApplication();
	}

	private static void testApplication(){
		LOGGER.info("Start testMethod");
		LOGGER.debug("App started at: {}", java.time.LocalDateTime.now());
		LOGGER.info("End testMethod");
	}
}
