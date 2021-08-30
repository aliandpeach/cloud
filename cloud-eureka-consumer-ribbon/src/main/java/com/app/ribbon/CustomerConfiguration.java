package com.app.ribbon;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通用方式: 在springboot能扫描包的范围之外(实际上只要不与主程序在同一级目录)定义RibbonClient的配置类
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/16 10:57:09
 */
@Configuration
public class CustomerConfiguration
{
    @Bean
    public IRule ribbonRule(@Autowired IClientConfig clientConfig)
    { // 自定义为随机规则
        return new RandomRule();
    }
}
