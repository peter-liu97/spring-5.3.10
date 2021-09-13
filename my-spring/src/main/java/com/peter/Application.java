package com.peter;

import com.peter.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		System.out.println(applicationContext.getBean(UserService.class));
	}
}
