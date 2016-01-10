package com.vajda.aspectExample.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomAspect {

    @Pointcut("execution(* com.vajda.aspectExample.service.CustomService.doSomething(..))")
    private void businessBoilerPlate() { }
    
    @Pointcut("execution(* com.vajda.aspectExample.service.CustomService.*(..))")
    private void goWithAll() { }
    
    @Pointcut("@annotation(com.vajda.aspectExample.aspect.CustAspectAnnotation) && execution(* *(..))")
    private void onlyWithAnnotation() { }
    
    @Before("businessBoilerPlate()")
    public void doBeforeBusinessLogic() {
        System.out.println("do before business logic");
    }
    
    @After("businessBoilerPlate()")
    public void doAfterBusinessLogic() {
        System.out.println("do after business logic");
    }
    
    @Before("goWithAll()")
    public void doBeforeAll() {
        System.out.println("do before all");
    }
    
    @Before("onlyWithAnnotation()")
    public void doBeforeAnnotation() {
        System.out.println("do before method with annotation");
    }
}
