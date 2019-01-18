Feign（声明式服务调用）
Feign 进行客户端负载均衡，通过 FeignClient 调用远程 Http 微服务


1、SpringCloud 生态圈中，使用一个类似于 Java HTTP 客户端的工具 Feign 来访问远程 HTTP 服务器；
2、虽然说我们可以采用 RestTemplate、URLConnection、Netty、HttpClient都可以访问远端 HTTP 服务器，但是使用 Feign 来说，
Feign 可以做到使用 HTTP 请求远程服务时就像调用本地的方法一样，让开发者完全感知不到这是在调用远端服务，感觉无非就是调用一个 API 方法一样；
3、当我们使用 Feign 的时候，SpringCloud 整合了 Ribbon 和 Eureka 去提供负载均衡；
