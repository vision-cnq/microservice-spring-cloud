package com.keivn.config;

import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @title   Feign配置类
 * @description
 * @author caonanqing
 * @createDate 2018/11/14
 * @version 1.0
 */
@Configuration
public class Configuration2 {

    // 直接访问是没有权限的，需要加上该注解配置服务提供者的账号密码。
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("kevin","123456");
    }

    // 在该配置中，加入这个方法的话，表明使用了该配置的地方，就会禁用该模块使用 Hystrix 容灾降级的功能；
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }

}
