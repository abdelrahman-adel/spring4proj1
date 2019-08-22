package com.master.spring.spring4proj1.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.master.spring.spring4proj1")
@SpringBootApplication
public class Spring4proj1Application {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring4proj1Application.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring4proj1Application.class, args);

		for (String bean : context.getBeanDefinitionNames()) {
			LOGGER.info("Bean: {}", bean);
		}
	}

}
