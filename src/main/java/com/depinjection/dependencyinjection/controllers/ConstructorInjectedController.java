package com.depinjection.dependencyinjection.controllers;

import com.depinjection.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController { // best way to inject
    private GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){  // lets Spring know which bean to chose!
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
