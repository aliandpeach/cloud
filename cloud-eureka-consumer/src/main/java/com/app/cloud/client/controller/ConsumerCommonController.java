package com.app.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client/common/v1")
public class ConsumerCommonController
{
    @Autowired
    @Qualifier("commonRestTemplate")
    private RestTemplate commonRestTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * http://192.190.10.122:42911/client/common/v1/hi?name=hello%20world
     */
    @RequestMapping("/hi")
    public String hello(String name)
    {
        // 未集成ribbon, 默认使用 BlockingLoadBalancerClient
        ServiceInstance serviceInstance = loadBalancerClient.choose("cloud-eureka-provider");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello?name=" + name;
        System.out.println(url);
        return commonRestTemplate.getForObject(url, String.class);
    }
}
