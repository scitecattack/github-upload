package com.depinjection.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ro")
@Primary
public class PrimaryRomanianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Service de salut primar";
    }
}
