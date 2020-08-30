package com.minsait.msa.labs.servicio2.service.impl;

import java.net.InetAddress;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.minsait.msa.labs.servicio2.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
	
	@Value("${var.holamundo: hola docker}")
	private String helloWorld;
	
	@Override
	public String helloWorld(String name) {
		return helloWorld+ Optional.ofNullable(name).orElse("");
	}
	@Override
	public String getServerAddress() throws Exception {

	        final String serverAddress = InetAddress.getLocalHost().getHostAddress();

	        return serverAddress;
	 }
}