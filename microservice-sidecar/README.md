集成异构微服务系统到 SpringCloud 生态圈中(比如集成 nodejs 微服务)

1、在一些稍微复杂点系统中，往往都不是单一代码写的服务，而恰恰相反集成了各种语言写的系统，并且我们还要很好的解耦合集成到自己的系统中；
2、出于上述现状，SpringCloud 生态圈中给我们提供了很好的插件式服务，利用 sidecar 我们也可以轻松方便的集成异构系统到我们自己的系统来；
3、该项目就是为了解决轻松简便的集成异构系统到自己的微服务系统中来的；

1.启动zureka
2.启动异构微服务
node node-service.js
3.启动zuul
访问异构微服务本身
http://localhost:8060/
通过zuul网关访问异构微服务
http://localhost:8040/microservice-sidecar