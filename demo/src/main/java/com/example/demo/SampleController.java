package com.example.demo;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = "/changePerson",
			method = RequestMethod.POST,
			consumes = "application/json",
			produces = "application/json")
	public Person changePerson(@RequestBody Person person) {
		
		Person response = new Person();
		response.setName(person.getName() + "Tester");
		response.setAge(person.getAge() + 100);
		
		return response;
		
	}
	
}
