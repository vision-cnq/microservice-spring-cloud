package com.keivn.cloud.controller;

import com.keivn.cloud.feign.UserFeignClient;
import com.keivn.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/movie/{id}")
    public User finById(@PathVariable long id ){
        return this.userFeignClient.findById(id);
    }

    @GetMapping(value = "/post-user")
    public User postUser(User user){
        return this.userFeignClient.postUser(user);
    }

    @GetMapping(value = "/get-user")
    public User getUser(User user){
        return this.userFeignClient.getUser(user);
    }

}
