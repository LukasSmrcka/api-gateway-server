package com.lukas.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayServer {
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayServer.class, args);
	}
}
