package com.keivn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @title  电影微服务，定制Feign，一个Feign功能禁用Hystrix，另一个Feign功能启用Hystrix。
 *  Feign: Java HTTP 客户端开发的工具。
 *  注解 EnableFeignClients 表示该电影微服务已经接入 Feign 模块。
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient	//注册到Eureka
@EnableFeignClients	//开启Fegin功能
public class ConsumerMovieFeignCustomizingWithoutHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignCustomizingWithoutHystrixApplication.class, args);
		System.out.println("FeignWithoutHystrix启动...");
	}
}
