package com.keivn.cloud.feign;

import com.keivn.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @title 用户Http请求的客户端。
 *  注解FeignClient的传参：表示的是注册到 Eureka 服务上的模块名称。
 * @description
 * @author caonanqing
 * @createDate 2018/11/9
 * @version 1.0
 */
//fallback = HystrixClientFallback.class，fallback是Hystrix的回退机制
//绑定该接口对应的服务，并且使用Hystrix支持回退，访问出现错误时，回退到HystrixClientFallback
//fallbackFactory是fallback的增强版，fallback与fallbackFactory不能同时使用
@FeignClient(name = "microservice-provider-user",
        fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {


    // 1.@GetMapping不支持，2.@PathVarible必须要得设置value
    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id );

}
