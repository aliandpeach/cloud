package com.app.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client/loadBalanced/v1")
public class ConsumerRibbonController
{
    @Autowired
    private RestTemplate restTemplate;

    /**
     * http://192.190.10.122:21113/client/loadBalanced/v1/hi?name=hello%20world
     */
    @RequestMapping("/hi")
    public String hello(String name)
    {
        return restTemplate.getForObject("http://cloud-eureka-provider/hello?name=" + name, String.class);
    }
}
