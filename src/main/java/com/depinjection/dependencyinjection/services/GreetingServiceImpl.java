package com.depinjection.dependencyinjection.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class GreetingServiceImpl  implements GreetingService{

public static final String HELLO_BELLO="Hello bello!";

@Override
    public String sayGreeting() {
        return HELLO_BELLO;
    }
}

