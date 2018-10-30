package com.DatamuseServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.netflix.discovery.DiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class DatamuseServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatamuseServerApplication.class, args);
	}

}
