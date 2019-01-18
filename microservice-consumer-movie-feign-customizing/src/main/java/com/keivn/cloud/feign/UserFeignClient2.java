package com.keivn.cloud.feign;

import com.keivn.config.Configuration2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @title 用户Http请求的客户端，FeignClient 注解地方采用了自定义的配置。
 *  注解FeignClient的传参：表示的是注册到 Eureka 服务上的模块名称。
 * @description
 * @author caonanqing
 * @createDate 2018/11/14
 * @version 1.0
 */
//xxx只是随意起的名称，实际是Eureka中Application的名称，url和name必须一起使用
@FeignClient(name = "xxx", url = "http://localhost:8761/", configuration = Configuration2.class) //绑定该接口对应的服务，以及配置
public interface UserFeignClient2 {

    //访问eureka里注册的服务的名称
    @RequestMapping(value ="/eureka/apps/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);

}
