package com.multi.service;

import com.multi.repository.MyRepository;
import org.springframework.stereotype.Service;

@Service   // 애너테이션 DI에서만 효력
public class MyServiceImpl implements MyService {

    private final MyRepository myRepository;
    private String prefix = "[DEFAULT]"; // XML DI에서 property로 오버라이드 하는 포인트

    // 생성자 주입(권장)
    public MyServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    // XML DI에서 prefix 설정해보는 setter
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String performAction(String name) {
        return prefix + " " + myRepository.getMessage(name);
    }
}

