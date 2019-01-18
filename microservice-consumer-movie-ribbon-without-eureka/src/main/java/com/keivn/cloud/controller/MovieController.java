package com.keivn.cloud.controller;

import com.keivn.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @title
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/movie/{id}")
    public User findById(@PathVariable long id ){
        //http://localhost:7900/simple/
        //VIP virtual IP
        //HAProxy Heartbeat
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
        System.out.println("---: " + serviceInstance.getServiceId() + ": " +serviceInstance.getHost() + ": " + serviceInstance.getPort());

        return this.restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
    }

    @GetMapping("/test")
    public String test(){
        // 指定需要调用的服务
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
        System.out.println("111: " + serviceInstance.getServiceId() + ": " +serviceInstance.getHost() + ": " + serviceInstance.getPort());

        ServiceInstance serviceInstance2 = this.loadBalancerClient.choose("microservice-provider-user2");
        System.out.println("222: " + serviceInstance2.getServiceId() + ": " +serviceInstance2.getHost() + ": " + serviceInstance2.getPort());

        return "1";
    }

}
