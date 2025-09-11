package com.multi.aop.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {//LoggingAspect
    //Aspect은 What +When +Where

    //When Before
    //* com.multi.service.MyService.*(..))이코든  pointcut을 의미한다 Where
    @Before("execution(* com.multi.service.MyService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        //비즈니스 로직을 수행했을 때.. 관련메소드 이름 반환
        String name= joinPoint.getSignature().getName();
        if(name.equals("performAction")) {//performAction라는 비즈니스 로직 메소드이면....
            System.out.println("logBefore PerformAction");
        } else if(name.equals("showMessage")) {//showMessage 라는 비즈니스 로직 메소드이면....
            System.out.println("logBefore showMessage");//What(공통부분)
        }

    }
    //execution(* com.multi.service.MyService.*(..))핵심코드(target)가 장소
    @AfterReturning("execution(* com.multi.service.MyService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter");//What(공통부분)
    }

}