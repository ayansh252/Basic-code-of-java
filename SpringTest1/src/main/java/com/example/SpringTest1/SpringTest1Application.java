package com.example.SpringTest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTest1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringTest1Application.class, args);
		ApplicationContext context = SpringApplication.run(SpringTest1Application.class, args);
		About about = context.getBean(About.class);
		about.details();
	}

}
