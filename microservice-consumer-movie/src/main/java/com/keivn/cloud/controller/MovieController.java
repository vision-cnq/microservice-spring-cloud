package com.keivn.cloud.controller;

import com.keivn.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${user.userServicePath}")
    private String userServicePath;

    @GetMapping(value = "/movie/{id}")
    public User finById(@PathVariable long id ){
        System.out.println("调用: "+this.userServicePath + id);
        return this.restTemplate.getForObject(this.userServicePath + id, User.class);
    }

}
