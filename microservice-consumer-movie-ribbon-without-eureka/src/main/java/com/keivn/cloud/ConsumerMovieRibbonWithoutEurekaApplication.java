package com.keivn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @title 电影Ribbon微服务，脱离Eureka使用配置listOfServers进行客户端负载均衡调度。
 *  LoadBalanced：该负载均衡注解，已经整合了 Ribbon；
 *  Ribbon 的默认负载均衡的算法为：轮询；
 *  配置文件优先级最高，Java代码设置的配置其次，默认的配置优先级最低；
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication	// 使用SpringBoot开发微服务
//@EnableEurekaClient	//注册到Eureka
public class ConsumerMovieRibbonWithoutEurekaApplication {

	@Bean
	@LoadBalanced //该注解让Restful拥有负载均衡的能力
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonWithoutEurekaApplication.class, args);
		System.out.println("RibbonWithoutEureka启动...");
	}
}
