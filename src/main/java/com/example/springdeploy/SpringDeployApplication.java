package com.example.springdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDeployApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDeployApplication.class, args);
		HelloController helloController = context.getBean(HelloController.class);
		helloController.holaMundo();

	}

}
