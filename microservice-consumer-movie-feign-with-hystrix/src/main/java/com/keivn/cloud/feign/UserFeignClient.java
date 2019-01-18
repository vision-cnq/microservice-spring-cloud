package com.keivn.cloud.feign;

import com.keivn.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @title   在Feign类中使用Hystrix的回退机制
 * @description
 * @author caonanqing
 * @createDate 2018/11/9
 * @version 1.0
 */
//fallback = HystrixClientFallback.class，fallback是Hystrix的回退机制
//绑定该接口对应的服务，并且使用Hystrix支持回退，访问出现错误时，回退到HystrixClientFallback
@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignClient {

    // 1.@GetMapping不支持，2.@PathVarible必须要得设置value
    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id );

}
