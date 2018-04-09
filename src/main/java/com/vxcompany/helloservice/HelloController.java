package com.vxcompany.helloservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping
    public String sayHelloWorld() {
        return service.sayHello(null);
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return service.sayHello(name);
    }
}
