package com.keivn.config;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @title 认证配置，由于 UserFeignCustomSecondClient 访问 http://localhost:8761/ 需要密码登录，
 * 所以才有了此配置的出现。
 * @description
 * @author caonanqing
 * @createDate 2018/11/14
 * @version 1.0
 */
@Configuration
public class Configuration2 {

    // 直接访问是没有权限的，需要加上该注解配置登录 Eureka 服务器的帐号与密码。
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("kevin","123456");
    }

}
