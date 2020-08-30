package com.minsait.msa.labs.servicio1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.msa.labs.servicio1.service.HelloWorldService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloWorldController {
	
private final HelloWorldService service;

	public HelloWorldController(HelloWorldService service) {
		this.service = service;
	}
	@GetMapping(path = "/helloWorld") 
	public ResponseEntity<String>helloWorld(@RequestParam(name = "name") String name){
		
		log.debug("Entering helloWorld(name='{}')" ,name); 
		String response = service.helloWorld(name); 
		log.debug("Leaving helloWorld() with: {}", response); 
		 
		 return ResponseEntity.ok(response);
	}	
}
