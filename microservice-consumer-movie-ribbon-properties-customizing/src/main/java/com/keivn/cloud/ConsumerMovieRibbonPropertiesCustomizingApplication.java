package com.keivn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @title 电影微服务，使用 application.yml 配置文件配置 Ribbon 在客户端进行负载均衡调度算法。
 *  LoadBalanced：该负载均衡注解，已经整合了 Ribbon；
 *  Ribbon 的默认负载均衡的算法为：轮询；
 *  配置文件优先级最高，Java代码设置的配置其次，默认的配置优先级最低；
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient	//注册到Eureka
public class ConsumerMovieRibbonPropertiesCustomizingApplication {

	@Bean
	@LoadBalanced //该注解让Restful拥有负载均衡的能力
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonPropertiesCustomizingApplication.class, args);
		System.out.println("RibbonProperties启动...");
	}
}
