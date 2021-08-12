package com.app.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        // 构造函数内部维护了 各自解析转换器
        return new RestTemplate();
    }

    @Bean
    public RestTemplate baseSampleRestTemplate()
    {
        // 构造函数内部维护了 各自解析转换器
        return new RestTemplate();
    }
}
