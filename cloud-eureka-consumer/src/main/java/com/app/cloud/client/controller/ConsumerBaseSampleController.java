package com.app.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client/base/v1")
public class ConsumerBaseSampleController
{
    @Autowired
    private RestTemplate baseSampleRestTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * http://192.190.10.122:21113/client/base/v1/hi?name=hello%20world
     */
    @RequestMapping("/hi")
    public String hello(String name)
    {
        ServiceInstance serviceInstance = loadBalancerClient.choose("cloud-eureka-provider");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello?name=" + name;
        System.out.println(url);
        return baseSampleRestTemplate.getForObject(url, String.class);
    }
}
