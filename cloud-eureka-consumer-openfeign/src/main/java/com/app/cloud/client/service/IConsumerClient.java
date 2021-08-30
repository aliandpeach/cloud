package com.app.cloud.client.service;

import com.app.cloud.config.OpenFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/16 09:45:59
 */
@FeignClient(value = "cloud-eureka-provider", configuration = {OpenFeignConfiguration.class})
public interface IConsumerClient
{
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
