package com.kevin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 *
 * @title   EurekaServer注册中心
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@SpringBootApplication  //设为springboot
@EnableZuulProxy    //开启zuul功能
public class GatewayZuulRegExpApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulRegExpApplication.class, args);
        System.out.println("Zuul启动...");
    }

    //使用regemapper在serviceId和路由之间提供约定。它使用名为group的正则表达从serviceId中提取变量并将它们注入到路由模式中
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper(){
        return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)","${version}/${name}");
    }

}
