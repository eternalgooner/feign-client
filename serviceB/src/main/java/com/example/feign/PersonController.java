package com.example.feign;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Controller("/person")
public class PersonController {

    @GetMapping("/person")
    ResponseEntity<Person> getPerson(){
        System.out.println("received request from service A, for GET person");
        Person person = new Person("vini", 40);
        System.out.println("sending back person to service A: " + person);
        return ResponseEntity.of(Optional.of(person));
    }

    @PostMapping("/person")
    ResponseEntity<Person> postPerson(@RequestBody Person person){
        System.out.println("service B received POST request with person: " + person);
        Person returnPerson = new Person("post working", 99);

        System.out.println("returning person from service B: " + returnPerson);
        return ResponseEntity.of(Optional.of(returnPerson));
    }
}
