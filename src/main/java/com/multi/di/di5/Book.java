package com.multi.di.di5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//getter, setter, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String bookName;
    private int price;
    private String author;
    private String publisher;
    //생성자 다음으로 호출되는 함수
    public void init(){
        System.out.println("init");
    }
    //종료되는 시점에 호출됨
    public void destroy(){
        System.out.println();
    }
}
