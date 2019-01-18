package com.kevin.cloud.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @author kevin
 * @version 1.0
 * @title 自定义Zuul回退机制处理器。
 * 提供一个回退机制当路由后面的服务发生故障时。
 * @description
 * @createDate 2018/11/30
 */
@Component
public class MyFallbackProvider implements ZuulFallbackProvider {

    //返回值表示需要针对此微服务做回退处理（该名称一定要是注册进入 eureka 微服务中的那个 serviceId 名称）；
    @Override
    public String getRoute() {
        // 表明是为了哪个微服务提供回退，*表示为所有微服务提供回退
        return "microservice-provider-user";
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                //fallback时的状态码OK是200，BAD_REQUEST是400
                return HttpStatus.BAD_REQUEST;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                //数字类型的状态码，本例返回的其实就是200，详见httpStatus
                return HttpStatus.BAD_REQUEST.value();
            }

            @Override
            public String getStatusText() throws IOException {
                //状态文本，本例返回的其实就是ok，详见HttpStatus
                return HttpStatus.BAD_REQUEST.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            /* 当 springms-provider-user 微服务出现宕机后，客户端再请求时候就会返回 fallback 等字样的字符串提示；
             *
             * 但对于复杂一点的微服务，我们这里就得好好琢磨该怎么友好提示给用户了；
             */
            @Override
            public InputStream getBody() throws IOException {
                //响应体
                return new ByteArrayInputStream(("fallback："+getRoute()).getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                //headers设定
                HttpHeaders headers = new HttpHeaders();
                MediaType mediaType = new MediaType("application", "json", Charset.forName("UTF-8"));
                headers.setContentType(mediaType);
                return headers;
            }
        };
    }
}