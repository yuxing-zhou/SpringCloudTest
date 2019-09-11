package com.zyx.feign.service;

import com.zyx.feign.rpc.IGetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private IGetHello getHello;

    public String sayHello(){
        return getHello.sayhello();
    }

}
