package com.keivn.cloud.feign;

import com.keivn.cloud.entity.User;
import com.keivn.config.Configuration1;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 *
 * @title
 * @description
 * @author caonanqing
 * @createDate 2018/11/9
 * @version 1.0
 */
@FeignClient(name = "microservice-provider-user", configuration = Configuration1.class
    ,fallback = HystrixClientFallback.class) //绑定该接口对应的服务，以及配置
public interface UserFeignClient {

    // 覆写Feign默认的配置，使用的Feign本身的注解，而不是SpringMVC
    @RequestLine("GET /simple/{id}") //GET请求+空格+请求地址
    public User findById(@Param("id") Long id );

}
