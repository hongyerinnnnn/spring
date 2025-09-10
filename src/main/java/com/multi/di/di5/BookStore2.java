package com.multi.di.di5;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/*
   @Resource(name ="book2")
    private Book book;//선언부가 생성자보다 우선순위가 높음


 */
@Component(value = "bookStore2")
public class BookStore2 {

    @Resource(name ="book2")
    private Book book;//선언부

    public BookStore2() {
    }

    public BookStore2(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
    @Resource(name ="book1")
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookStore2{" +
                "book=" + book +
                '}';
    }
}
