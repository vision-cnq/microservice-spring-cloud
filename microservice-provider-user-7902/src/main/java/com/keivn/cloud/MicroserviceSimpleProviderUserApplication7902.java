package com.keivn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @title   服务提供者
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleProviderUserApplication7902 {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleProviderUserApplication7902.class, args);
		System.out.println("服务提供者启动...");
	}
}
