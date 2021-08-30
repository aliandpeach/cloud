package com.app.cloud.config;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置 OpenFeign
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/16 10:31:23
 */
@Configuration
public class OpenFeignConfiguration
{
    @Bean
    public Contract feignContract()
    {
        return new feign.Contract.Default();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor()
    {
        return new BasicAuthRequestInterceptor("user", "password");
    }
}
