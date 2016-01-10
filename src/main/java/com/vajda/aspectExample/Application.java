package com.vajda.aspectExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vajda.aspectExample.service.CustomService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        CustomService cs = ctx.getBean(CustomService.class);
        System.out.println("-----------------");
        cs.doSomething();
        System.out.println("-----------------");
        cs.doSomething(23);
        System.out.println("-----------------");
        cs.doSomethingElse();
        System.out.println("-----------------");
        cs.doSomethingThird();
        System.out.println("-----------------");
    }
}