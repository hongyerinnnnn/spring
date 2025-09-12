package com.multi.aop.aop2;

import com.multi.repository.ActionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aop2Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AspectConfig.class);
//        System.out.println(applicationContext.getBean("actionServiceImp"));//비즈니스로직 수행을 하기위한 객체
        ActionService actionService= applicationContext.getBean("actionServiceImp", ActionService.class);
        actionService.showMessage();//비즈니스로직 수행...
    }
}