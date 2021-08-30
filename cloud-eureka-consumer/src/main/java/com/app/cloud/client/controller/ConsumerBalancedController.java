package com.app.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client/balanced/v1")
public class ConsumerBalancedController
{
    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate balancedRestTemplate;

    /**
     * http://192.190.10.122:42911/client/balanced/v1/hi?name=hello%20world
     */
    @RequestMapping("/hi")
    public String hello(String name)
    {
        return balancedRestTemplate.getForObject("http://cloud-eureka-provider/hello?name=" + name, String.class);
    }
}
