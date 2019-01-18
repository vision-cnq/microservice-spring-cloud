package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @title   EurekaServer注册中心
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
@EnableEurekaClient     //实现服务发现，注册
public class FileUploadZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadZuulApplication.class, args);
        System.out.println("EurekaClient启动...");
    }

}
