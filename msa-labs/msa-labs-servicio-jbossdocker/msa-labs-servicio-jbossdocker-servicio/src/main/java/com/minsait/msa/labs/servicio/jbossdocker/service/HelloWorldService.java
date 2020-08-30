package com.minsait.msa.labs.servicio.jbossdocker.service;

public interface HelloWorldService {
	
	String helloWorld(String name);
	String getServerAddress() throws Exception;
}
