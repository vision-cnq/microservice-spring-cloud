服务消费者。也注册到 EurekaServer 中，通过 Http 协议访问已注册到生态圈中的用户微服务

1、在 eureka 服务治理框架中，微服务与微服务之间通过 Http 协议进行通信；
2、用户微服务作为消费方、电影微服务作为提供方都注册到 EurekaServer 中；
3、在电影微服务Web层通过 application.yml 的硬编码配置方式实现服务之间的通信；
