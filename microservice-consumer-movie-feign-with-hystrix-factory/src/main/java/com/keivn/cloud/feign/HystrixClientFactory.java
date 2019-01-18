package com.keivn.cloud.feign;

import com.keivn.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @title Hystrix 客户端回退机制类。
 *  这里加上注解 Component 的目的：就是因为没有这个注解，运行时候会报错，报错会说没有该类的这个实例，
 *  所以我们就想到要实例化这个类，因此加了这个注解。
 * @description
 * @author caonanqing
 * @createDate 2018/11/28
 * @version 1.0
 */
@Component
public class HystrixClientFactory implements FallbackFactory<UserFeignClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        // HystrixClientFactory.LOGGER.info("fallback; reason was: {}", throwable.getMessage());
        // 传统写法
        return new UserFeignClientWithFactory() {
            @Override
            public User findById(Long id) {
                User user = new User();
                user.setId(-1L);
                return user;
            }
        };
    }
}
