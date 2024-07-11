package io.angoa.realty.clouddiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClouddiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClouddiscoveryApplication.class, args);
	}

}
