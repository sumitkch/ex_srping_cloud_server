package com.ubs.ex_srping_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExSrpingCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExSrpingCloudServerApplication.class, args);
	}

}
