package com.app.cloud.client.controller;

import com.app.cloud.ribbon.IConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/v1")
public class ConsumerController
{
    @Autowired
    private IConsumerClient consumerClient;

    /**
     * http://192.190.10.122:21113/client/v1/hi?name=hello%20world
     */
    @RequestMapping("/hi")
    public String hello(String name)
    {
        return consumerClient.hello(name);
    }
}
