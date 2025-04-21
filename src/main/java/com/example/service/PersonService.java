package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {

	public String findInfos() {
		return new Person(1, "firstname", "lastname").toString();
	}
}
