package com.test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.HelloWorldBean;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		System.out.println("Hello API");
		return "Hello World from method";
		
	}
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello World from Bean");
	}
}
