package com.app.cloud.config;

import feign.Contract;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置 OpenFeign
 *
 * 使用 new feign.Contract.Default() 配合 @RequestLine @Param
 * 使用 new SpringMvcContract() 配合 @RequestMapping @RequestParam
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/16 10:31:23
 */
@Configuration
public class OpenFeignConfiguration
{
//    @Bean
//    public Contract feignContract()
//    {
//        return new feign.Contract.Default();
//    }

    @Bean
    public Contract feignConfiguration()
    {
        return new SpringMvcContract();
    }

//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor()
//    {
    // 服务端认证
//        return new BasicAuthRequestInterceptor("user", "password");
//    }
}
