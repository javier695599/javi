package com.minsait.msa.labs.servicio.jbossdocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.msa.labs.servicio.jbossdocker.service.HelloWorldService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloWorldController {
	
private final HelloWorldService service;

	public HelloWorldController(HelloWorldService service) {
		this.service = service;
	}
	@GetMapping(path = "/helloWorldJboss") 
	public ResponseEntity<String>helloWorld(@RequestParam(name = "name") String name){
		
		log.debug("Entering helloWorld(name='{}')" ,name); 
		String response = service.helloWorld(name); 
		log.debug("Leaving helloWorld() with: {}", response); 
		 
		 return ResponseEntity.ok(response);
	}	
	
	
	  @GetMapping(value = "/dokerIp")
	  public ResponseEntity<String> helloDocker() throws Exception {
		  	log.debug("Entering helloDocker"); 
	        String serverAddress = service.getServerAddress();
	        log.debug("Leaving helloDocker() with: {}", serverAddress); 
	        return ResponseEntity.ok(new StringBuilder().append("Hello from IP address: ").append(serverAddress).append("\n").toString());
	    }
}
