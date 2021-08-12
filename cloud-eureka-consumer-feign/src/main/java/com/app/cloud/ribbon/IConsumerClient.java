package com.app.cloud.ribbon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/12 15:11:40
 */
@FeignClient("cloud-eureka-provider")
public interface IConsumerClient
{
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
