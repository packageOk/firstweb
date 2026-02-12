package com.pkok.firstweb.controller;

import com.pkok.firstweb.service.hello.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello(@RequestParam("user") String user) {
        return helloService.hello(user);
    }
}
