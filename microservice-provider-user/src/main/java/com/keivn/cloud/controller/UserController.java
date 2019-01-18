package com.keivn.cloud.controller;

import com.keivn.cloud.entity.User;
import com.keivn.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

/**
 *
 * @title
 * @description
 *  作用：
 *  1：测试服务实例的相关内容
 *  2：为后来的服务做提供
 * @author caonanqing
 * @createDate 2018/11/6
 * @version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id ){
        System.out.println("7900服务提供者");
        return this.userRepository.findOne(id);
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        InstanceInfo instanceInfo = this.eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
        return instanceInfo.getHomePageUrl();
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
       return user;
    }

    @PostMapping("/get-user")
    public User getUser(User user){
        return user;
    }


}
