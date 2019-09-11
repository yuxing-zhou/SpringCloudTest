package com.zyx.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHello(){
        return restTemplate.getForObject("http://ribbon-provider/hello?name=zhouyuxing",String.class);
    }
}
