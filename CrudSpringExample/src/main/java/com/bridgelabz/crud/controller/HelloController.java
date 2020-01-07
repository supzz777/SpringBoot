package com.bridgelabz.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user") 
 //it males the class a rest controller.
public class HelloController 
{
	/*this annotation takes the  url as the parameter for whom we have to call this method.
	 * This annotation only maps the Get method by default .
	 * If we want to call other method we have to mentiom it explicitly,*/
	@GetMapping("/hello")
	public String sayHi()
	{
		return "Hello.. This is my 1st API";
	}
	
	@GetMapping("/test")
	public String testing() {
		return "Hello";
	}

}
