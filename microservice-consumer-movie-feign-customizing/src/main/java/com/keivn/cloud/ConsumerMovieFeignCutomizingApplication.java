package com.keivn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @title   服务消费者
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient	//注册到Eureka
@EnableFeignClients	//开启Fegin功能
public class ConsumerMovieFeignCutomizingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignCutomizingApplication.class, args);
		System.out.println("FeignCustomizing启动...");
	}
}
