package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PersonService;

@RestController
public class HelloController {
	
	@Autowired
	private PersonService personService;
	
    @GetMapping("/hello")
    public String sayHello() {
    	
        return personService.findInfos();
    }
}
