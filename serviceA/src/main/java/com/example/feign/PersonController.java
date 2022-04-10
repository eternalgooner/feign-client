package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    ResponseEntity<Person> getPerson(){
        System.out.println("service A received GET request");
        System.out.println("calling GET person using feign client from service A");
        Person person = personService.getPerson();

        System.out.println("received person from service B: " + person);
        return ResponseEntity.of(Optional.of(person));
    }

    @PostMapping
    ResponseEntity<Person> postPerson(@RequestBody Person person){
        System.out.println("service A received POST request with person: " + person);
        System.out.println("calling POST person using feign client from service A");
        Person personFromServiceB = personService.postPerson(person);

        System.out.println("received person from service B: " + personFromServiceB);
        return ResponseEntity.of(Optional.of(personFromServiceB));
    }
}
