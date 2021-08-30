package com.app.cloud;


import com.app.ribbon.CustomerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "cloud-eureka-provider",configuration = CustomerConfiguration.class)
public class CloudEurekaClientApplication
{
    // Ribbon 是 Netflix开源的基于HTTP和TCP等协议负载均衡组件
    // Ribbon 可以用来做客户端负载均衡，调用注册中心的服务
    // Ribbon的使用需要代码里手动调用目标服务
    // spring-cloud-2020后, spring-cloud-starter-netflix-ribbon 被删除, pom中需要自行指定版本号
    public static void main(String[] args)
    {
        SpringApplication.run(CloudEurekaClientApplication.class, args);
    }
}