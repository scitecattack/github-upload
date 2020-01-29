package com.depinjection.dependencyinjection;

import com.depinjection.dependencyinjection.controllers.PropertyInjectedController;
import org.junit.Before;
import org.junit.Test;
import com.depinjection.dependencyinjection.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;


public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController= new PropertyInjectedController();
        this.propertyInjectedController.greetingService=new GreetingServiceImpl();
    }

    @Test
    public  void  testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_BELLO, propertyInjectedController.PICSayHello());

    }


}
