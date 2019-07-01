package com.funong.newerp.service.Impl;

import com.funong.newerp.facade.HelloFacade;
import com.funong.newerp.service.logic.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloFacadeImpl implements HelloFacade {
    @Autowired
    HelloService helloService;
    @Override
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
