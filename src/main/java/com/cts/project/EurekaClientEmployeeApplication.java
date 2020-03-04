package com.cts.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientEmployeeApplication.class, args);
	}

}
