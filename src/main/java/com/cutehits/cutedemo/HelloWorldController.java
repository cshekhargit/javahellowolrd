package com.cutehits.cutedemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String  HelloWorld()
	{
		return "Hello World";
	}
}
