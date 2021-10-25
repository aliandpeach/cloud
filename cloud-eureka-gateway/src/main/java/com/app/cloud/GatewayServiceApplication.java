package com.app.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/10/11 14:11:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

}
