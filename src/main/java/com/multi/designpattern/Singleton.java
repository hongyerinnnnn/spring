package com.multi.designpattern;


public class Singleton {
    private static Singleton instance;
    //static 정적요소
    private Singleton() {}

    // 필요할 때 인스턴스를 생성
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
