package com.vxcompany.helloservice;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(String name) {
        String message = "Hello %s from Hello Service.";
        if (name == null) {
            return String.format(message, "World");
        }
        return String.format(message, name);
    }
}
