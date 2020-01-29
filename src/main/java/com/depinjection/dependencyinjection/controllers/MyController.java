package com.depinjection.dependencyinjection.controllers;

import com.depinjection.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
