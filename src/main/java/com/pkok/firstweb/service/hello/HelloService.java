package com.pkok.firstweb.service.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String user) {
        return "Hello, " + user;
    }
}
