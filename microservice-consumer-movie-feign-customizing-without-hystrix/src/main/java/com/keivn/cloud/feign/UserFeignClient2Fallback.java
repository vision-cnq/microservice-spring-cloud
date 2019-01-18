package com.keivn.cloud.feign;

/**
 *
 * @title
 * @description
 * @author caonanqing
 * @createDate 2018/11/28
 * @version 1.0
 */
public class UserFeignClient2Fallback implements UserFeignClient2{

    @Override
    public String findServiceInfoFromEurekaByServiceName(String serviceName) {
        return "userFignClient2";
    }
}
