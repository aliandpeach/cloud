package com.app.cloud.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/ribbon/v1")
public class ConsumerRibbonController
{
    /**
     * http://192.190.10.122:42912/client/feign/v1/hi?name=hello%20world
     */
    @RequestMapping("/hi")
    public String hello(String name)
    {
        return "hi" + System.currentTimeMillis();
    }
}
