package com.example.functional;
@FunctionalInterface
public interface MyFunctionalInterface {
    void m1();

    default void m2(){
        System.out.println("Default method 1");
    }

    default void m3(){
        System.out.println("Default method 2");
    }
}
