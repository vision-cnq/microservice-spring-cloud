package com.keivn.cloud.feign;

import com.keivn.cloud.entity.User;
import com.keivn.config.Configuration1;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 *
 * @title  用户Http请求的客户端，FeignClient 注解地方采用了自定义的配置。
 *  注解FeignClient的传参：表示的是注册到 Eureka 服务上的模块名称。
 * @description
 * @author caonanqing
 * @createDate 2018/11/9
 * @version 1.0
 */
@FeignClient(name = "microservice-provider-user", configuration = Configuration1.class) //绑定该接口对应的服务，以及配置
public interface UserFeignClient {

    //这里的注解 RequestLine、Param 是 Feign 的配置新的注解，详
    // 细请参考链接：https://github.com/OpenFeign/feign
    // 覆写Feign默认的配置，使用的Feign本身的注解，而不是SpringMVC
    @RequestLine("GET /simple/{id}") //GET请求+空格+请求地址
    public User findById(@Param("id") Long id );

}
