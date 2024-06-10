package com.annot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //starts spring container
@ComponentScan(basePackages = "com.annot") //for multiple pkgs bean, use array {}
public class AppConfig {
	
	@Bean(value="std")
	public Student getStudentBean() {
		
		return new Student();
	}
}
