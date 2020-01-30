package com.depinjection.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("hu")
public class PrimaryHungarianGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Primary Magyar udvözöl!";
    }
}
