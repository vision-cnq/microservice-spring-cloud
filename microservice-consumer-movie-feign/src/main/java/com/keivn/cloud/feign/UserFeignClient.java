package com.keivn.cloud.feign;

import com.keivn.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @title .用户Http请求的客户端。
 * 注解FeignClient的传参：表示的是注册到 Eureka 服务上的模块名称，
 * 也就是需要访问的微服务名称。
 * @description
 * @author caonanqing
 * @createDate 2018/11/9
 * @version 1.0
 */
@FeignClient("microservice-provider-user") //绑定该接口对应的服务
public interface UserFeignClient {

    // 1.@GetMapping不支持，2.@PathVarible必须要得设置value
    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id );

    //如果入参是一个对象的话，那么这个方法在 feign 里面默认为 POST 方法，就算你写成 GET 方式也无济于事。
    // 测试POST请求方式
    @RequestMapping(value = "/post-user", method = RequestMethod.POST)
    public User postUser(@RequestBody User user);

    // 测试GET请求方式
    @RequestMapping(value = "/get-user", method = RequestMethod.GET)
    public User getUser(User user);

}
