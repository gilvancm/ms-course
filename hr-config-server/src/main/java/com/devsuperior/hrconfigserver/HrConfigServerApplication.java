package com.devsuperior.hrconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//temos que incluir a dependencia Config Sever

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

}
