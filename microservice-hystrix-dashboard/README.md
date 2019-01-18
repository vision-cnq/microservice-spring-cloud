Hystrix Dashboard主要用来监控Hystrix的各项指标信息。
支持三种不同的监控方式：
1.默认的集群监控：通过URL:http://hostname:port/turbine/turbine.stream开启，实现对默认集群的监控。
2.指定的集群监控：通过URL:http://hostname:port/turbine/turbine.stream?cluster=[clusterName]开启，实现对clusterName集群的监控。
3.单体应用的监控：通过URL:http://hystrix-app:port/hystrix.stream开启，实现对具体某个服务实例的监控。

Delay：控制服务器上轮询监控信息的延迟时间，默认为2000毫秒，可以通过配置该属性来降低客户端的网络和CPU消耗。
Title：该参数可以展示合适的标题。


1.启动ZurekaServer注册中心
2.启动Provider服务提供者
3.启动需要监控的Ribbon的Hystrix和Feign Hystrix
4.启动Hystrix Dashboard
5.启动Hystrix Turbine

查看ribbon结合hystrix的界面
http://localhost:8011/hystrix.stream

监控http://localhost:8011/hystrix.stream
http://localhost:8030/hystrix