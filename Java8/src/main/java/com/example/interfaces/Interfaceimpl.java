package com.example.interfaces;

public class Interfaceimpl implements I1, I2{

    @Override
    public int meth1() {
        System.out.println("hello");
        return 1;
    }

    public static void main(String[] args) {
        new Interfaceimpl().meth1();
    }
}
