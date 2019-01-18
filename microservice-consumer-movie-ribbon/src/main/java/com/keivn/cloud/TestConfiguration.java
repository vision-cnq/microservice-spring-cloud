package com.keivn.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @title  测试定制 Ribbon ,而且该定制的配置文件是在应用扫描的目录里面，也就是说应用启动后该文件会被扫描到。
 *  * RibbonClient 中的 name 名称，一定要是 eureka 服务中注册的名称。
 * @description
 * @author caonanqing
 * @createDate 2018/11/8
 * @version 1.0
 */
@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {

    //@Autowired
    //IClientConfig iClientConfig;

    //@Bean
    //public IRule ribbonRule(IClientConfig config){
    //    return new RandomRule();
    //}
    //采用随机分配的策略。
    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
    }

}
