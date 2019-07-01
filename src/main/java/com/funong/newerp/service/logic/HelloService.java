package com.funong.newerp.service.logic;

public class HelloService {


    public String sayHello(String name) {
        if (null == name || "".equals(name.trim())) {
            return "please input name";
        }
        return "Hello " + name;
    }
}
