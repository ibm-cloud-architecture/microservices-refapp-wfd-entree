package com.ibm.microservices.wfd.entree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EntreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntreeApplication.class, args);
		System.out.println("Running "+EntreeApplication.class+" via Spring Boot!");
	}
}
