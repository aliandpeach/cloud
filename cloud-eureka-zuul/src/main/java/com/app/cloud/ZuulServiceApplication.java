package com.app.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/10/11 14:11:39
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient // Adding @EnableEurekaClient solved this issue: Zuul throwing "Load balancer does not have available server for client"
@EnableDiscoveryClient
public class ZuulServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }

}
