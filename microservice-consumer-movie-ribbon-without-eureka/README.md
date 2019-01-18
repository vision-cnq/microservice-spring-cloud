ribbon是客户端负载均衡组件。
脱离Eureka使用配置listOfServers进行客户端负载均衡调度

1、通过尝试脱离服务治理框架，脱离 eureka 生态圈，单独操作客户端负载均衡调度；
2、该项目只是使用了 restTemplate.getForObject 来测试客户端负载均衡算法；