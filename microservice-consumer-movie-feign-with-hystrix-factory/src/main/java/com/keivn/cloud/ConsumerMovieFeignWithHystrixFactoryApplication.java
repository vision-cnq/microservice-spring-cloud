package com.keivn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @title  电影微服务接入Feign，添加 fallbackFactory 属性来触发请求进行容灾降级。
 * Feign: Java HTTP 客户端开发的工具。
 * 注解 EnableFeignClients 表示该电影微服务已经接入 Feign 模块。
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient	//注册到Eureka
@EnableFeignClients	//开启Fegin功能
public class ConsumerMovieFeignWithHystrixFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignWithHystrixFactoryApplication.class, args);
		System.out.println("HystrixFactory启动...");
	}
}
