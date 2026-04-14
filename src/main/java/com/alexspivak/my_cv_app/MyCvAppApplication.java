package com.alexspivak.my_cv_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyCvAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCvAppApplication.class, args);
	}

}