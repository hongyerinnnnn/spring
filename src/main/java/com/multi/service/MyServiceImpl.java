// src/main/java/com/multi/service/MyServiceImpl.java
package com.multi.service;

import com.multi.repository.MyRepository;

//@Service
public class MyServiceImpl implements MyService {

    private final MyRepository myRepository;
    private String prefix = "[DEFAULT]";

    public MyServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String performAction(String name) {
        System.out.println("performAction 비즈니스로직 수행");
        return prefix + " " + myRepository.getMessage(name);
    }

    public MyRepository getMyRepository() {
        return myRepository;
    }

    @Override
    public void showMessage() {//메소드 오버라이드 추가됨
        System.out.println("showMessage");
    }
}
