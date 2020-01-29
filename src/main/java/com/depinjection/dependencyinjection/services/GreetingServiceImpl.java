package com.depinjection.dependencyinjection.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl  implements GreetingService{

public static final String HELLO_BELLO="Hello bello!";

@Override
    public String sayGreeting() {
        return HELLO_BELLO;
    }
}

