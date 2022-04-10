package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServiceAApplication {

	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);

	}

}
