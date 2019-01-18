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
    public User finById(@PathVariable Long id ){
        return this.userFeignClient.findById(id);
    }


}
