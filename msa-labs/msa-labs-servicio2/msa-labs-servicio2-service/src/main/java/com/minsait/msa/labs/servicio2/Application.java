package com.minsait.msa.labs.servicio2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.minsait.msa.labs.servicio2")
@SpringBootApplication 
public class Application {
	
	
	public static void main(String[] args) { 
		SpringApplication.run(Application.class, args);
	}
}