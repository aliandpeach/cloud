package com.app.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class CloudEurekaClientApplication
{
    //OpenFeign是Spring Cloud 在Feign的基础上支持了Spring MVC的注解，如@RequesMapping等等。
    //OpenFeign的@FeignClient可以解析SpringMVC的@RequestMapping注解下的接口，
    public static void main(String[] args)
    {
        SpringApplication.run(CloudEurekaClientApplication.class, args);
    }
}
