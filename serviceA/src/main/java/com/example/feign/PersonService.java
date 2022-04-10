package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "feignPersonService", url = "http://localhost:8081/person")
public interface PersonService {

    @GetMapping
    Person getPerson();

    @PostMapping
    Person postPerson(Person person);

}
