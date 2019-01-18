ribbon是客户端负载均衡组件。
可以使用轮询和随机方式调用服务。
使用 application.yml 配置文件配置 Ribbon 在客户端进行负载均衡调度算法

1、通过 application.yml 配置来设置 Ribbon 客户端进行负载均衡的调度算法；
2、通过 restTemplate.getForObject、loadBalancerClient.choose 
两种代码调用方式来测试客户端负载均衡算法；
