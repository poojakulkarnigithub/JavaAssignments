package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}

}
