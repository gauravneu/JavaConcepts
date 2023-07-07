package com.example.inheritance;

public class AbstractExtendEx extends AbstractClassEx{
    @Override
    void method2() {
        System.out.println("Method2");
    }
}


class Tst{
    public static void main(String[] args) {
        AbstractClassEx ab = new AbstractExtendEx();
        ab.method2();
    }
}