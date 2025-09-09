package com.multi.designpattern;
//Factory Pattern

interface Product {
    void use();
}

class ProductA implements Product {
    @Override
    public void use() {
        System.out.println(" ");
    }
}

class ProductB implements Product {
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}

class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if (type.equals("B")) {
            return new ProductB();
        }//else if
        //throw new IllegalArgumentException("Unknown product type");
        return null;
    }//createProduct

}

public class FactoryMain {
    Product product = SimpleFactory.createProduct("A");
}
