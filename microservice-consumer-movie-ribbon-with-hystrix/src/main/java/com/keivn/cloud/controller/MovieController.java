package com.keivn.cloud.controller;

import com.keivn.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 *
 * @title Web控制器测试断路器功能。
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    //@HystrixCommand注解为方法创建调用失败的保险，fallbackMethod指定失败时需要调用的方法，
    //  @HystrixCommand(fallbackMethod = "findByIdFallback", commandProperties = @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE"))
    // 增加commandProperties属性，则是同一个线程，不然都是单独的一个线程
    @GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public User findById(@PathVariable Long id ){
        return this.restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
    }

    // 该方法是调用失败时方法的方法，类型和返回值都需要与请求的方法一致。
    public User findByIdFallback(Long id){
        User user = new User();
        user.setId(0L);
        return user;
    }


}
