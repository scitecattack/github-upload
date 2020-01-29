package com.depinjection.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.depinjection.dependencyinjection.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {  //avoid Property injection!

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

 public String PICSayHello(){
     return greetingService.sayGreeting();
    }

}
