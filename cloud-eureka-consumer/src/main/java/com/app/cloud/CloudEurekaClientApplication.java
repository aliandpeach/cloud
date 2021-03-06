package com.app.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaClientApplication
{

    // Feign是Spring Cloud组件中的一个轻量级RESTful的HTTP服务客户端
    // Feign内置了Ribbon，用来做客户端负载均衡，去调用服务注册中心的服务。
    public static void main(String[] args)
    {
        SpringApplication.run(CloudEurekaClientApplication.class, args);
    }

}
