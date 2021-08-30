package com.app.cloud.provider.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController
{
    @Autowired
    private DiscoveryClient discoveryClient;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name)
    {
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("cloud-eureka-provider");
        return name + ", Welcome to service provider";
    }
}
