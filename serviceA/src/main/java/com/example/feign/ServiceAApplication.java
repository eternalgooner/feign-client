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

//		new ServiceAApplication().start();
	}

//	private void start() {
//
//		System.out.println("calling get person using feign client");
//		Person person = personService.getPerson();
//		System.out.println("received person:" + person);
//	}

}
