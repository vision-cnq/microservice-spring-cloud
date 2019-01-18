package com.keivn.config;


import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/**
 *
 * @title   通过声明额外的配置来控制Feign Client（覆写默认配置）
 * @description 为了不与Spring Boot的Application的ComponentScan包冲突，将配置类放到cloud包外面
 * @author caonanqing
 * @createDate 2018/11/14
 * @version 1.0
 */
@Configuration
public class Configuration1 {

    // 契约，Contract使用的是Feign本身的注解
    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }

    // 启动日志
    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }

}
