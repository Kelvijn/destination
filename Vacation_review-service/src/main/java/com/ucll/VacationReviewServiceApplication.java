package com.ucll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VacationReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationReviewServiceApplication.class, args);
	}
}
