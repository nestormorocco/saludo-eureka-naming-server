package com.nestorms.eureka.naming.server.saludoeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SaludoEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaludoEurekaNamingServerApplication.class, args);
	}
}
