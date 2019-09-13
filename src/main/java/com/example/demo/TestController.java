package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public ResponseEntity<?> get() {
		return  ResponseEntity.ok().build();
	}
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<?> data(@RequestBody String data) {
		System.out.println("Data: " + data);
		return  ResponseEntity.ok().build();
	}
}
