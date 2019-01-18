# microservice-spring-cloud

#### 项目介绍
SpringCloud微服务中Eureka、ribbon、feign、zuul、hystrix、sidecar等的测试


1.Eureka服务注册中心：端口（8761）http://localhost:8761/
2.User服务提供者：端口（7900）http://localhost:7900/simple/1（microservice-provider-user）
3.User服务提供者：端口（7901）http://localhost:7901/simple/1（microservice-provider-user）
4.User服务提供者：端口（7902）http://localhost:7902/simple/1（microservice-provider-user）
5.User服务提供者：端口（7903）http://localhost:7903/simple/1（microservice-provider-user2）
6.User服务消费者：端口（7911）http://localhost:7911/movie/1（microservice-consumer-movie）
7.Ribbon负载均衡代码自定义：端口（8010）http://localhost:8010/movie/1（microservice-consumer-movie-ribbon）
8.Ribbon负载均衡配置文件设置：端口（8011）http://localhost:8011/movie/1（microservice-consumer-movie-ribbon-properties-customizing）
9.Ribbon脱离Eureka：端口（8012）http://localhost:8012/movie/1（microservice-consumer-movie-ribbon-without-eureka）
10.Feign声明式服务调用：端口（8100）http://localhost:8100/movie/1（microservice-consumer-movie-feign）
11.Feign声明式服务调用：端口（8101）http://localhost:8101/movie/1（microservice-consumer-movie-feign-cutomizing）
12.Feign禁用和启动Hystrix：端口（8102）http://localhost:8102/movie/1（microservice-consumer-movie-feign-customizing-without-hystrix）
13.Feign禁用和启动Hystrix使用Factory：端口（8103）http://localhost:8103/movie/1（microservice-consumer-movie-feign-with-hystrix-factory）
14.Feign和Hystrix：端口（8104）http://localhost:8104/movie/1（microservice-consumer-movie-feign-with-hystrix-factory）
15.Hystrix监控Dashboard：端口（8030）http://localhost:8030/hystrix（microservice-consumer-movie-feign-with-hystrix-factory）
16.zuul网关：端口（8040）http://localhost:8040/microservice-provider-user/simple/1（microservice-gateway-zuul）
17.zuul网关的回退：端口（8041）http://localhost:8041/microservice-provider-user/simple/1（microservice-gateway-zuul-fallback）
18.sidecar异构微服务+zuul：端口（8070）http://localhost:8040/microservice-sidecar（microservice-sidecar）
