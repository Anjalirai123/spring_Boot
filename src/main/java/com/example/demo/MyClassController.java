package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClassController {
	@GetMapping("/")
	public String display() {
		String str="hello";
		return str;
	}

}
