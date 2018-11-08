package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String test() throws InterruptedException{
		System.out.println("Thread sleeping for 30 seconds");
		Thread.sleep(30000);
		return "test";
	}

}
