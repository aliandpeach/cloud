package com.app.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client/v1")
public class ConsumerController
{
    @Autowired
    private RestTemplate restTemplate;

    @LoadBalanced
    @Bean
    public RestTemplate rest()
    {
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String hello(String name)
    {
        // http://192.190.10.122:21113/client/v1/hi?name=hello%20world
        return restTemplate.getForObject("http://cloud-eureka-provider/hello?name=" + name, String.class);
    }
}
