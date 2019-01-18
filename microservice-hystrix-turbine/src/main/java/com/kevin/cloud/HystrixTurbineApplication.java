package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 *
 * @title   Hystrix Dashboard主要用来监控Hystrix的各项指标信息
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //springboot启动类
@EnableTurbine          //hystrix的Turbine监控器
public class HystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class, args);
        System.out.println("HystrixTurbine启动...");
    }

}
