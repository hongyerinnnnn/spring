package com.multi.repository;

import com.multi.service.MyService;
import com.multi.service.MyServiceImpl;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryMyRepository implements MyRepository {

//    public static void main(String[] args) {
//        //UpCasting, DownCasting, Polymorphism
//        MyRepository myRepository = new MemoryMyRepository();
//    }

    @Override
    public String getMessage(String name) {
        return "Hello " + name;
    }
}
