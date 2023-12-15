package com.example.clientui1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.clientui1")
public class Clientui1Application {

	public static void main(String[] args) {
		SpringApplication.run(Clientui1Application.class, args);
	}

}
