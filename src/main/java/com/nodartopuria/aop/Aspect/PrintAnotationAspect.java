package com.nodartopuria.aop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintAnotationAspect {
    @Before("@annotation(com.nodartopuria.aop.Aspect.Println)")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("გადაცემული არგუმენტები["+joinPoint.getArgs()[0]+joinPoint.getArgs()[1]+"]");
        System.out.println("გამრავლება შესრულდა");
    }
}
