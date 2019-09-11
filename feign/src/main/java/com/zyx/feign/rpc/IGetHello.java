package com.zyx.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ribbon-consumer")
public interface IGetHello {
    @RequestMapping(value = "/hello?name=zyx",method = RequestMethod.GET)
    public String sayhello();
}
