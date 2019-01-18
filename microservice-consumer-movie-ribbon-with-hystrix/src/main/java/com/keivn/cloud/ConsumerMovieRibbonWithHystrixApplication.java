package com.keivn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @title 电影 Ribbon 微服务集成 Hystrix 断路器实现失败快速响应，达到熔断效果。
 *  注解 EnableCircuitBreaker 表明需要集成断路器模块；
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient	//注册到Eureka
@EnableCircuitBreaker	//开启断路器
public class ConsumerMovieRibbonWithHystrixApplication {
	@Bean
	@LoadBalanced //该注解让Restful拥有负载均衡的能力
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonWithHystrixApplication.class, args);
		System.out.println("RibbonHystrix启动...");
	}
}
