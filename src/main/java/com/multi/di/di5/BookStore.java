package com.multi.di.di5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class BookStore {
    //원래 자바의 순서는 Field 다음이 생성자로 되어 있어서
    // b1이 di 되고 후에 생성자 불려져서 b2 나와야 하지만
    // StringBean의 순서는 생성자 -> Field -> Method로 되어있어
    // 결과적으로 생성자가 먼저됨
    @Autowired
    @Qualifier("b1")//field
    private Book book;

    public BookStore() {
    }
    @Autowired
    public BookStore(@Qualifier("b2")Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "book=" + book +
                '}';
    }
}
