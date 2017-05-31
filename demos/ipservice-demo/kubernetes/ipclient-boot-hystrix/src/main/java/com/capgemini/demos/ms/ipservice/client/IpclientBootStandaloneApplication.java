package com.capgemini.demos.ms.ipservice.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class IpclientBootStandaloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpclientBootStandaloneApplication.class, args);
	}
}
