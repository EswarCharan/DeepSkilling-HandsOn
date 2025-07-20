package com.cognizant.loanser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class LoanserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanserApplication.class, args);
	}

}
