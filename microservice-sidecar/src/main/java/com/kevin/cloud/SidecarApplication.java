package com.kevin.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 *
 * @title   集成异构微服务系统到 SpringCloud 生态圈中(比如集成 nodejs 微服务)。
 * 注意 EnableSidecar 注解能注册到 eureka 服务上，是因为该注解包含了 eureka 客户端的注解，该 EnableZuulProxy 是一个复合注解。
 * @EnableSidecar --> { @EnableCircuitBreaker、@EnableDiscoveryClient、@EnableZuulProxy } 包含了 eureka 客户端注解，同时也包含了 Hystrix 断路器模块注解，还包含了 zuul API网关模块。
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication
@EnableSidecar
public class SidecarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidecarApplication.class, args);
        System.out.println("SideCar启动...");
    }

}
