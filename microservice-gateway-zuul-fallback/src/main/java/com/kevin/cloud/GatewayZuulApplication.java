package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *
 * @title   zuul路由后面的微服务挂了后，zuul提供一种回退机制应对熔断处理
 * 注意EnableZuulProxy注解能注册到eureka服务上，是因为该注解包含了 eureka 客户端的注解，该 EnableZuulProxy 是一个复合注解。
 * @EnableZuulProxy --> { @EnableCircuitBreaker、@EnableDiscoveryClient } 包含了 eureka 客户端注解，同时也包含了 Hystrix 断路器模块注解。
 *  http://localhost:8040/routes 地址可以查看该zuul微服务网关代理了多少微服务的serviceId。
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
@EnableZuulProxy    //开启zuul功能
public class GatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApplication.class, args);
        System.out.println("GatewayZuulFallback服务启动...");
    }

}
