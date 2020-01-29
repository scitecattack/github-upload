package com.depinjection.dependencyinjection;

import com.depinjection.dependencyinjection.controllers.ConstructorInjectedController;
import com.depinjection.dependencyinjection.controllers.MyController;
import com.depinjection.dependencyinjection.controllers.PropertyInjectedController;
import com.depinjection.dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

       ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.sayHello();
System.out.println(controller.sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).PICSayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
