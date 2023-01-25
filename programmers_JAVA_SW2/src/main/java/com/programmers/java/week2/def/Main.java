package com.programmers.java.week2.def;

interface MyInterface{
    void method1();

    default void sayHello(){
        System.out.println("Hello World");
    }
}

public class Main implements MyInterface{
    public static void main(String[] args) {
        new Main().sayHello();


    }

    @Override
    public void method1() {
        throw new RuntimeException();

    }

}
