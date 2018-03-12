package com.xinmi.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.config.ConfigServerProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class BootStrap {
	public static void main(String[] args){
		
//		SpringApplication.run(args);ßß
		SpringApplication.run(BootStrap.class, args);
		
	}
}
