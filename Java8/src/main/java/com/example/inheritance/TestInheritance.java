package com.example.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Parent p = new Child();
        p.hello();
        p.wassup();

        Child c = new Child();
        c.bye();
        c.wassup();
    }
}
