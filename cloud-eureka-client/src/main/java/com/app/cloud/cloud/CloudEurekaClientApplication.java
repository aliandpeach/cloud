package com.app.cloud.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaClientApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(CloudEurekaClientApplication.class, args);
    }

}
