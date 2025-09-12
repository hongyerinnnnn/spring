package com.multi.aop.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //what +when +where
@Component//객체를 생성하라는 annotation
public class LoginAspect {

    //    @Before("execution(* com.multi.repository.ActionService.*(..))")
//    public void beforeMehod(){
//        System.out.println("beforeMethod");//what(공통단 코드)
//    }
//    @AfterReturning("execution(* com.multi.repository.ActionService.*(..))")
//    public void afterRetuning(){
//        System.out.println("afterMethod");//what(공통단 코드)
//    }
//    @After("execution(* com.multi.repository.ActionService.*(..))")
//    public void after(){
//        System.out.println("after");//what(공통단 코드)
//    }
//    @AfterThrowing("execution(* com.multi.repository.ActionService.*(..))")
//    public void afterThrowing(){
//        System.out.println("afterThrowing");//what(공통단 코드)
//    }
    //
    @Around("execution(* com.multi.repository.ActionService.*(..))")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("around before");
        try {
            proceedingJoinPoint.proceed();
            System.out.println("around process");
        } catch (Throwable e) {
            System.out.println("around exception");
            e.printStackTrace();
        } finally {
            System.out.println("around finally after");
        }
        System.out.println("around after returning");
    }
}