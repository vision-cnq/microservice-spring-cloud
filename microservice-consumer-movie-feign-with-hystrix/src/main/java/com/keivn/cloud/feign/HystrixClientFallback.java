package com.keivn.cloud.feign;

import com.keivn.cloud.entity.User;
import org.springframework.stereotype.Component;

/**
 *
 * @title
 * @description
 * @author caonanqing
 * @createDate 2018/11/28
 * @version 1.0
 */
@Component
public class HystrixClientFallback implements UserFeignClient{

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
