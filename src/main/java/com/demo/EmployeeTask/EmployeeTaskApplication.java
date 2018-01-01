package com.demo.EmployeeTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTaskApplication.class, args);
	}
}
