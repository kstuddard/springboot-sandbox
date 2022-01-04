package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

	@GetMapping("/Another/")
	public String index() {
		return "Yet Another Controller";
	}
}
