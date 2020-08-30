package com.minsait.msa.labs.servicio.jboss.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.minsait.msa.labs.servicio.jboss.service.HelloWorldService;

@Service
public class HelloWorldServiceIMpl implements HelloWorldService {
	
	@Value("${hola-mundo: hola Mundo Jboss}")
	private String helloWorld;
	
	@Override
	public String helloWorld(String name) {
		return helloWorld+ Optional.ofNullable(name).orElse("");
	}

}
