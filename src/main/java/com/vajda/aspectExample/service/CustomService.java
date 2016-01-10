package com.vajda.aspectExample.service;

import org.springframework.stereotype.Component;

import com.vajda.aspectExample.aspect.CustAspectAnnotation;

@Component
public class CustomService {

    public void doSomething() {
        System.out.println("doSomething()");
    }
    
    @CustAspectAnnotation
    public void doSomething(Integer numArg) {
        System.out.println("doSomething(" + numArg + ")");
    }
    
    public void doSomethingElse() {
        System.out.println("doSomethingElse()");
    }
    
    @CustAspectAnnotation
    public void doSomethingThird() {
        System.out.println("doSomethingThird()");
    }
}
